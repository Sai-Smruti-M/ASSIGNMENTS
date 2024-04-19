import java.util.*;
class laptop
{
	private String model;
	private double price;
	public void setm(String model)
	{
			this.model=model;
	}
	public void setp(double price)
	{
			this.price=price;
	}
	
	
	@Override
	public String toString()
	{
		return "Model="+model +" "+"Price="+ price;
	}
}
public class q4
{

	public static void main(String[] args) 
	{
		laptop l=new laptop();
		l.setm("Hp");
		l.setp(75000.0);
        System.out.println(l.toString());
	}

}
//toString() method returns an object's value as string 
//It is a method of the object class which is the super class to all the class
//we override this method to provide our own functionality
//when we dont use to String and try to print an object directly it will give us the reference value of the object
//but after the usage of toString method one can directly print the values of the object as string format
//it is used in comparing purpose where we can compare an object to our desired result
//if we don't use toString method to compare it can compare the objects reference value 
//in place of its constraint values
