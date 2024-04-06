package q3;
import java.util.*;

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    




class car implements Comparable<car>
{
	  public int getModalno() {
		return modalno;
	}
	public String getName() {
		return name;
	}
	public int getStock() {
		return stock;
	}
	private int modalno;
	  private String name;
	  private int stock;
	  car(int modalno,String name,int stock)
	  {
		  this.name=name;
		  this.stock=stock;
		  this.modalno=modalno;
	  }
	  @Override
		public boolean equals(Object o)
		{
			car obj=(car)o;
			if((this.stock)==(obj.stock))
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
	  @Override
	  public int compareTo(car c)
	  {

			if((this).equals(c))
			{
				return 0;
			}
			else if(this.stock<c.stock)
			{
				return -1;
			}
			else
			{
				return 1;
			}
	  }
}
public class q3 
{

	public static void main(String[] args)
	{
		ArrayList<car> r=new ArrayList<car>();
		r.add(new car(3214,"SAI",20));
		r.add(new car(1873,"NIDA",12));

		r.add(new car(3127,"TANU",11));

		r.add(new car(3627,"DIYA",17));

		r.add(new car(7369,"SHRADDHA",15));
		 System.out.println("details of owner before sorting=");
	        for(car i:r)
	        {
	        	System.out.println("name="+i.getModalno()+",age="+i.getName()+",stock="+i.getStock());
	        	
	        }
	        System.out.println();
	        System.out.println();
	        System.out.println("details of owner after sorting=");

	        for(int i=0;i<r.size()-1;i++)
			{
				for(int j=0;j<r.size()-i-1;j++)
				{
					if((r.get(j).compareTo(r.get(j+1)))==1)
					{
						car temp;
						
				        temp=r.get(j);
				        r.set(j, r.get(j + 1));
	                    r.set(j + 1, temp);
					}
				}
				
			}
	        for(car i:r)
	        {
	        	System.out.println("modalno="+i.getModalno()+",name="+i.getName()+",stock="+i.getStock());
	        	
	        }
	        


		
	}

}
