import java.util.*;
class college
{
	String collegename;
	String collegeloc;
	college(String n,String l)
	{
		this.collegename=n;
		this.collegeloc=l;
	}
	public String getcname()
	{
		return collegename;
	}
	public String getcloc()
	{
		return collegeloc;
	}
}
class student 
{
	college col;
	int studentid;
	String studentname;
	student(college col,int studentid,String studentname)
	{
		this.col=col;
		this.studentid=studentid;
		this.studentname=studentname;
	}
	public void displaystudentinfo()
	{
		System.out.println("studentid="+studentid+"student name="+studentname+"college location="+col.getcloc()+"college name="+col.getcname());
    }
}
public class q5 
{

	public static void main(String[] args) 
	{
		college ITER=new college("ITER","Jagamara");
		college CVRaman=new college("CVRaman","Gangapada");
		
		student s1=new student(ITER,2210,"Sai");
		student s2=new student(CVRaman,2341,"Subha");
		System.out.println("info of student 1=");
		s1.displaystudentinfo();
		System.out.println("info of student 2=");
		s2.displaystudentinfo();
		
		
		
		
		

	}

}
