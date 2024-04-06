package lambda;import java.util.*;

public class multiple_parameters 
{
	interface reportcard
	{
		public int mfs(int Mathematics,int phy,int bio,int hist,int chem);
	}

	public static void main(String[] args)
	{
		reportcard am1_gen=(int Mathematics,int phy,int bio,int hist,int chem)->(Mathematics+phy+bio+hist+chem);
		System.out.println(am1_gen.mfs(40, 40, 50, 60, 70));
		
		reportcard am2_engg=(int Mathematics,int phy,int bio,int hist,int chem)->(Mathematics*2+phy/2+chem/2);//after arrow method body
		System.out.println(am2_engg.mfs(40, 60, 50, 60, 70));
		
		reportcard am3=(int Mathematics,int phy,int bio,int hist,int chem)->(Mathematics+phy+bio+hist+chem);
		System.out.println(am3.mfs(40, 40, 50, 70, 70));
		
		reportcard am4=(int Mathematics,int phy,int bio,int hist,int chem)->(Mathematics+phy+bio+hist+chem);
		System.out.println(am4.mfs(50, 40, 50, 60, 70));
		
	    List<Integer> a=new ArrayList<Integer>();
	    a.add(20);
	    a.add(30);
	    a.add(40);
	    a.forEach((i)->System.out.println(i*i));
	    
	}

}
