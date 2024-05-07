package thread;

import java.util.Scanner;

public class p1 extends Thread
{

	public static void main(String[] args) 
	{
		p1 n=new p1();
		n.start();
		Scanner sc=new Scanner(System.in);
		int c,a,b;
		System.out.println("enter the value of a and b");
		System.out.println(Thread.currentThread().getName());
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println(c);

		int s=2;
		System.out.println(s);
          
	}
	public void run()
	{
		
		System.out.println(Thread.currentThread().getName());

		
		System.out.println("my new thread is running");
	}

}
