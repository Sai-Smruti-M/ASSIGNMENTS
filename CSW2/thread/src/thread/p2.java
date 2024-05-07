package thread;

public class p2 {

	public static void main(String[] args)
	{
		worker w1 =new worker(true);
		worker w2 =new worker(false);
		Thread t=new Thread(w1);
		
		t.start();
		Thread t1=new Thread(w2);
		t1.start();
	}

}
class worker implements Runnable
{
	boolean e;
	worker(boolean e)
	{
		this.e=e;
	}
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			if(e==true)
			{
				if(i%2==0)
				{
					System.out.print(i+",");
				}
			}
			else
			{
				if(i%2!=0)
				{
				System.out.print(i+",");
				}
			}
		}
	}
}
//class worker2 implements Runnable
//{
//	public void run()
//	{
//
//		for(int i=0;i<=10;i++)
//		{
//			if(i%2==0)
//			{
//				System.out.print(i+",");
//			}
//		}
//	}
//}
