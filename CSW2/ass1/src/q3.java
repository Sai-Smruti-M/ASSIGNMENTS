class point
{
	private double x;
	private double y;
	public point(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	public double getx()
	{
		return x;
	}
	public double gety()
	{
		return y;
	}
	// copy constructor
	public point(point oldpointer)
	{
		this.x=oldpointer.getx();
		this.y=oldpointer.gety();
		
	}
}
public class q3 {

	public static void main(String[] args) 
	
	{
		point oldpoint=new point(2,3);
		point newpoint=new point(oldpoint);
		System.out.println("copied x="+newpoint.getx());
		System.out.println("copied y="+newpoint.gety());

	}

}
