import java .util.*;
class bankacc
{
	private String name;
	private int acc;
	private double bal;
    bankacc(String name,int acc,double bal)
    {
    	this.name=name;
		this.acc=acc;
		this.bal=bal;
    }
	public void set(String name,int acc,double bal) 
	{
		this.name=name;
		this.acc=acc;
		this.bal=bal;
	}
	public int getid() 
	{
		return this.acc;
	}
	public String getname() 
	{
		return this.name;
	}
	public double getbal() 
	{
		return this.bal;
	}
	@Override
    public String toString()
    {
		return name+ " " + acc+ " "+ bal;
    }
	@Override
	public boolean equals(Object b1)
	  {
		if(b1==null)
		{
			return false;
		}
		else if(b1==this)
		{
			return true; 
		}
		
	    if(b1 instanceof bankacc)
	    {
	    	bankacc b=(bankacc)b1;
	    
	    if(b.name==this.name && b.acc== this.acc && b.bal== this.bal)
	    {
	    	   return true;
	    }
	    	
	    
	    else
	    {
	    	return false;
	    }
	    }
	    return false;
	  }
	
}

public class tostring 
{

	public static void main(String[] args) 
	{
	  
		List<bankacc> acc_list=new ArrayList<bankacc>();
	 bankacc ba1=new bankacc("Sai",132542,161515);
	 bankacc ba2=new bankacc("sohaib",136272,125515);
	 bankacc ba3=new bankacc("Sai",132542,161515);
	 bankacc ba4=new bankacc("Sai",132542,161515);
	 bankacc ba5=new bankacc("ragini",132542,161515);
	 acc_list.add(ba1);
	 acc_list.add(ba2);
	 acc_list.add(ba3);
	 acc_list.add(ba4);
	 acc_list.add(ba5);
	 System.out.println(acc_list);
	 System.out.println(search_acc(acc_list,ba4));
	 merge(acc_list,ba1);
	 for(bankacc i:acc_list)
	 {
		 System.out.println(i);
	 }
	 
	}
	public static boolean search_acc(List acc_list,bankacc x)
	{
		return(acc_list.contains(x));
	}
	public static void merge(List<bankacc> acc_list,bankacc someacct)
	{
		List<bankacc> duplist=null;
		double sumofbalance=0;
		for(bankacc i:acc_list)
		{
			
			if(i.equals(someacct))
			{
				duplist.add(i);
				
			}
			acc_list.removeAll(duplist);
			
			
		}
		for(bankacc e:duplist)
		{
			sumofbalance=sumofbalance+e.getbal();;
		}
		bankacc n=new bankacc(someacct.getname(),someacct.getid(),sumofbalance);
		acc_list.add(n);
		
	}
	 
		 
		  


}
