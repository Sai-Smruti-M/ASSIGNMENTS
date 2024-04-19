import java.util.*;
class rectangle
{
	private int length;
	private int width;
	rectangle(int length,int width)
	{
		this.length=length;
		this.width=width;
		
	}
	public int getl()
	{
		return length;
		
	}
	public int getw()
	{
		return width;
		
	}
	public double area()
	{
		return (length*width);
	}
	public double perimeter()
	{
		return (2*(length+width));
	}
	
}
public class q2 
{

	public static void main(String[] args) 
	{
		rectangle r=new rectangle(4,5);
		System.out.println("length"+r.getl());
		System.out.println("width"+r.getw());
                System.out.println("perimeter"+r.perimeter());
                System.out.println("area"+r.area());
       
       
	}
}


