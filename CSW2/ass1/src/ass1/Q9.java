package ass1;

import java.util.ArrayList;

public class Q9 
{

	public static void main(String[] args) 
	{
		course c=new course("CSW","172124");
		student a=new student("Sai","2241013383","cse");
		student b=new student("Aksa","1130102272","datascience");
		c.displaydetails();
		c.enroll(a);
		c.enroll(b);
		c.displaydetails();
		c.drop(b);
		c.displaydetails();
		
		course d=new course("ALA","746553");
		d.enroll(b);
		d.drop(a);
		d.displaydetails();
		d.enroll(b);
		
		
	}

}

interface EnrollmentSystem
{
	void enroll(student s);
	void drop(student s);
	void displaydetails();
}

class student
{
	private String name,regno,brnch;
	

	public student(String name, String regno, String brnch) {
		super();
		this.name = name;
		this.regno = regno;
		this.brnch = brnch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegno() {
		return regno;
	}

	public void setRegno(String regno) {
		this.regno = regno;
	}

	public String getBrnch() {
		return brnch;
	}

	public void setBrnch(String brnch) {
		this.brnch = brnch;
	}

	@Override
	public String toString() {
		return "\n(Name: " + name + ", Registration_number: " + regno + ", Branch=" + brnch + ")";
	}
	
	
	
}
class course implements EnrollmentSystem
{
	
	private String cName,cCode;
	private ArrayList<student> st=new ArrayList<student>();
	
	
	

	public course(String cName, String cCode) {
		super();
		this.cName = cName;
		this.cCode = cCode;
	}

	public String getCName() {
		return cName;
	}

	public void setCName(String cName) {
		this.cName = cName;
	}

	public String getCCode() {
		return cCode;
	}

	public void setCCode(String cCode) {
		this.cCode = cCode;
	}

	@Override
	public void enroll(student s) 
	{
		

		try {
			if(this.st.contains(s))
			{
				throw new Exception();
			}
			else
			{
				this.st.add(s);
			}
		}
		catch(Exception e) 
		{
			System.out.println("the recentle added student already exists.. ");
			
		}
		
	}

	@Override
	public void drop(student s) 
	{
		try {
			if(this.st.contains(s))
			{
				this.st.remove(s);
			}
			else
			{
				throw new Exception();
			}
		}
		catch(Exception e) 
		{
			System.out.println("the removed student does not exists. ");
			
		}
		
	}

	@Override
	public void displaydetails() 
	{
		System.out.println("Couse: "+this.getCName()+"\nCode: "+this.getCCode());
		System.out.println("Enrolled students: "+this.st.toString());
		
	}
	
	
	
}
class Enrollment
{
	public static void enrollStudent(course c,student s)
	{
		c.enroll(s);
	}
	public static void dropStudent(course c,student s)
	{
		c.drop(s);
	}
	
}