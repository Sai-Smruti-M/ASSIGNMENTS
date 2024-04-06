package q5;


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
	public int compareTo(student s)
	{
		if(this.equals(s))
		{
			return 0;
		}
		else if(this.rn>s.rn)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
}
public class q5 
{

	public static void main(String[] args) 
	{
		student<Integer> a[]=new student[5];
		a[0]=new student<>("s1",2,19);
		a[1]=new student<>("s2",1,20);
		a[2]=new student<>("s3",3,15);
		a[3]=new student<>("s4",5,13);
		a[4]=new student<>("s5",4,18);
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if((a[j].compareTo(a[j+1]))==-1)
				{
					student temp;
					
			        temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
			
			
			
			
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i].getName());
		}
		

	}


}


