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
//it is used in comparing purpose where we can compare an object to our desired result
//if we don't use toString method to compare it can compare the objects reference value 
//in place of its constraint values