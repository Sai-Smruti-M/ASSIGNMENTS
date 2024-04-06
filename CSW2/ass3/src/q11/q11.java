package q11;
import java.util.HashMap;
public class q11 
{

	public static void main(String[] args)
	{
	
		int ar[]= {5,5,4,2,5,4,2,8,6,6,14,7,6,4};
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        for(int i:ar)
        {
        	h.put(i,1);
        	
        }
        System.out.println("smallest missing number present is");
        for(int i=1;i<10;i++)
        {
        	if(!h.containsKey(i))
        	{
        		System.out.print(i);
        		break;
        	}
        }
	}

}
