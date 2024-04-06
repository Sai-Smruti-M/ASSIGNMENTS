package q4;

import java.util.*;

class student<T> implements Comparable<student<T>>
{
	public student(String name, int rn, int tm) {
		
		this.name = name;
		this.rn = rn;
		this.tm = tm;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRn() {
		return rn;
	}
	public void setRn(int rn) {
		this.rn = rn;
	}
	public int getTm() {
		return tm;
	}
	public void setTm(int tm) {
		this.tm = tm;
	}
	String name;
	int rn;
	int tm;
	@Override
	public boolean equals(Object o)
	{
		student obj=(student)o;
		if((this.rn)==(obj.rn))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public int compareTo(student s)
	{
		if((this).equals(s))
		{
			return 0;
		}
		else if(this.rn<s.rn)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
}
public class q4 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		student a[]=new student[5];
		a[0]=new student<>("s1",2,19);
		a[1]=new student("s2",1,20);
		a[2]=new student("s3",3,15);
		a[3]=new student("s4",5,13);
		a[4]=new student("s5",4,18);
		System.out.println("enter the roll no of the student u want to search=");
		int rn=sc.nextInt();
		student r=new student(null,rn,0);
		
	for(int i=0;i<a.length;i++)		
	{
		if((a[i]).compareTo(r)==0)
		{
			System.out.println("student details..");
				System.out.println("name="+a[i].getName());
			System.out.println("rollno="+a[i].getRn());
			System.out.println("marks="+a[i].getTm());

				
			}
		}
		
		
		

	}

}
