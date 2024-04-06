import java.util.*;
abstract class account
{
	private String accno;
	private double balance;
	public account(String accno,double balance)
	{
		this.accno=accno;
		this.balance=balance;
		
	}

		public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public String toString()
	{
		return "accno="+this.accno+" "+"balance="+getBalance();
	}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
}
class savingsaccount extends account{
	public double getintrestrate() {
		return intrestrate;
	}

	public void setIr(double intrestrate) {
		this.intrestrate = intrestrate;
	}

	private double intrestrate;
	public savingsaccount(String acno, double bal,double intrestrate) {
		super(acno, bal);
		this.intrestrate=intrestrate;
	}

	@Override
	public void deposit(double amt) {
		setBalance(getBalance()+amt+(amt*intrestrate/100));
	}

	@Override
	public void withdraw(double amt) {
		if(getBalance()>=amt) {
			setBalance(getBalance()-amt);
		}
		else {
			System.out.println("Balance is insufficient");
		}
	}
	

}
class currentaccount extends account{
	public double geto() {
		return o;
	}
	
	public void seto(double o) {
		this.o = o;
	}

	public currentaccount(String accno, double bal,double o) 
	{
		super(accno, bal);
		this.o=o;
	}
	

	private double o;

	@Override
	public void deposit(double amount)
	{
		setBalance(getBalance()+amount);
	}

	@Override
	public void withdraw(double amount) 
	{
		if(getBalance()-amount>=-o) 
		{
			setBalance(getBalance()-amount);
		}
		else
		{
			System.out.println("ur overdraft limit is exceeded");
		}
	}
	
	
}
public class q7 {

	public static void main(String[] args) {
		savingsaccount s=new savingsaccount("ISR1432",50000,8.0);
		
		s.deposit(2000);
		s.withdraw(50);
		
		currentaccount c=new currentaccount("DJH1726",100000,1000);
		c.deposit(3000);
		c.withdraw(600);
		
		System.out.println(s);
		System.out.println(c);
	}

}