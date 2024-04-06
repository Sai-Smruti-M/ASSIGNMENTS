package q9;
import java.util.HashSet;
public class q9 {
    public static void main(String[] args) 
    {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        HashSet<Integer> h=new HashSet<>();
        HashSet<Integer> adds=new HashSet<>();
        
        for(int n:nums)
        {
        	if(h.contains(n))
        	{
        		adds.add(n);
        	}
        	else
        	{
        		h.add(n);
        	}
        }
        for(int n:adds)
        {
        	System.out.println(n);
        }
       
    }
}

