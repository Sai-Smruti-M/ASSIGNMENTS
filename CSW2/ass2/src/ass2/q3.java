package ass2;
class CAR implements Comparable<CAR>
{
	String model;
	String color;
	int speed;
	public CAR(String model, String color, int speed) {
		
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	public int compareTo(CAR c)
	{
		if(this.speed==c.speed))
		{
			return 0;
		}
		else if(this.speed<c.speed)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
	
}
public class q3 {

	public static void main(String[] args)
	{
		CAR C1=new CAR("Suzuki","white",120);
		CAR C2=new CAR("Toyota","white",130);
		System.out.println("IF BELOW VALUE IS 0 THEN BOTH THE CARS ARE SAME OTHERWISE DIFFERENT");
	    System.out.println("VALUE="+C1.compareTo(C2));
	  
	}

}
