import java.util.*;
class car
{
	
	private int make;
	private String model;
	car(int m,String mod)
	{
		this.make=m;
		this.model=mod;
	}
	car()
	{
		this.make=0;
		this.model=null;
	}
	public int getMake() {
		return make;
	}
	public void setMake(int make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}

public class q1 {

	public static void main(String[] args)
	{
		car mycar1=new car(2004,"toyota");
	    car mycar2=new car();
	    System.out.println(mycar1.getMake());
	    System.out.println(mycar1.getModel());
	    System.out.println();
	    System.out.println();
	    
        mycar2.setMake(2020);
        mycar2.setModel("Thar");
        System.out.println(mycar2.getMake());
        System.out.println(mycar2.getModel());
	}

}
