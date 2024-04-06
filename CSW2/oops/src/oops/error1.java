package oops;

import java.util.*;
public class error1{
	 public static void main(String[] args)
	 {
	   int var1 = 5;
	   int var2 = 0; // 0 is assigned to var2 to cause an exception by dividing var1 by 0
	   try
	   {
	     int var3 = var1 / var2; // This is the statement that will cause the exception 
	
	    }
	    catch (ArithmeticException e)
	    {
	      System.out.println("it is not possible to divide by 0");
	     }
	 }
	} 
	
