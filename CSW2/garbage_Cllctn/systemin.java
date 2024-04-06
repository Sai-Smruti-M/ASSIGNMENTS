package garbage_Cllctn;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class systemin 
{

	public static void main(String[] args) 
	{
	
	try
	{
		
	Scanner sc=new Scanner(new File("inputfile.txt"));
	String n=sc.next();
	int age=sc.nextInt();
	System.out.println(n);
	System.out.println(age);

	}
	catch(FileNotFoundException e)
	{
		System.out.println("something went wrong");
	}
	}
	
	
	
}


