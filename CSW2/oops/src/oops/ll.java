package oops;
import java.util.*;
public class ll {

	public static void main(String[] args)
	{
		LinkedList<String> obj=new LinkedList<String>();
		obj.add("a");
		obj.add("b");
		obj.add("c");
		obj.add("d");
		obj.add(2,"e");
		obj.add("f");
		obj.add("g");
		
		System.out.println("linked list is:"+ obj);
		obj.remove("b");
		obj.remove(3);
		obj.removeFirst();
		obj.removeLast();
		
		System.out.println("new linked list after removing:"+ obj);
		boolean stat=obj.contains("e");
		if(stat)
		{
			System.out.println("list contains the element e");
			
		}
		else
		{
			System.out.println("list dosent contains the element e");
		}

		
	}

}
