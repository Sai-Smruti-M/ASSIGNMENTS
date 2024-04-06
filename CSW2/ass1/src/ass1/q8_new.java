package ass1;
class owner
{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYob() {
		return yob;
	}
	public void setYob(int yob) {
		this.yob = yob;
	}
	String name;
	int yob;
	owner(String name,int yob)
	{
		this.name=name;
		this.yob=yob;
		
	}
	Vehichle c;
	public void setc(Vehichle c)
	{
		this.c=c;
	}
	
	
	
	
}
interface Vehichle
{
	
	public  void accelerate(double speed);//u dont need to write abstract as it 
	//is already abstract by default in an interface
	public  void brake();
	
}
class Car implements Vehichle
{
	
	@Override
	public void accelerate(double speed)
	{
		System.out.println("can go at least" +speed+"km/h");
	}
	@Override
	public void brake()
	{
		System.out.println("stop");
	}
	public void detail()
	{
		System.out.println("its a car");
	}
}
class bicycle implements Vehichle
{
	public void accelerate()
	{
		System.out.println("for info g=9.8m/s^2");
	}
	@Override
	public void accelerate(double speed)
	{
		System.out.println("can go at least" +speed+"km/h");
	}
	@Override
	public void brake()
	{
		System.out.println("stop");
	}
	public void detail()
	{
		System.out.println("its a bicycle");
	}
}
public class q8_new {

	public static void main(String[] args) 
	{
		
      Vehichle a=new Car();
      Vehichle b=new bicycle();
      
      System.out.println("info of first vehichle=");
      a.accelerate(120.0);
      a.brake(); 
    
      
      System.out.println("info of second vehichle=");
      b.accelerate(40.0);
      b.brake();    
      
      owner o1=new owner("person1",2003);
      owner o2=new owner("person2",2005);
      o1.setc(a);
      o2.setc(b);
      
      
	}

}

