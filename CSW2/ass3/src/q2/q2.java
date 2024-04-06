package q2;
import java.util.*;


class user implements Comparable<user>
{
	private String name;
	private int age;
	user(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	public String getn()
	{
		return this.name;
	}
	public int geta()
	{
		return this.age;
	}
	@Override
	public boolean equals(Object o)
	{
		user obj=(user)o;
		if((this.age)==(obj.age))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	@Override
	public int compareTo(user u)
	{
		if((this).equals(u))
		{
			return 0;
		}
		else if(this.age<u.age)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
}
class arraylistuser
{
	public static void main(String[] args)
	{
        ArrayList<user> a=new ArrayList<>();
        a.add(new user("SAI",20));
        a.add(new user("ANANDI",19));

        a.add(new user("AKSA",18));

        a.add(new user("JENNIE",17));

        a.add(new user("JISON",15));
        System.out.println("details of student before sorting=");
        for(user i:a)
        {
        	System.out.println("name="+i.getn()+",age="+i.geta());
        	
        }
        System.out.println();
        System.out.println();
        System.out.println("details of student after sorting=");

        for(int i=0;i<a.size()-1;i++)
		{
			for(int j=0;j<a.size()-i-1;j++)
			{
				if((a.get(j).compareTo(a.get(j+1)))==1)
				{
					user temp;
					
			        temp=a.get(j);
			        a.set(j, a.get(j + 1));
                    a.set(j + 1, temp);
				}
			}
			
		}
        for(user i:a)
        {
        	System.out.println("name="+i.getn()+",age="+i.geta());
        	
        }
        

	}
	
}
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//Iterator<user> it=arr_list.iterator();
//it.hasNext();
//it.next();
//it.remove();
//while(it.hasNext())
//{
//user u=it.next();
//}
//there is another interface comparator
//it has method called compare
//and it will take two objects
//class mark_comparator implements comparator<student>
//public int compare(student s1,student s2)


