package Encapsulation;

public class Account
{
	private int acNo;
	private String aName;
	private double balance;
	
	public void setAcno(int a)
	{
		acNo=a;
	}
	public int getAcno()
	{
		return acNo;
	}
	public void setAname(String n)
	{
		aName=n;
	}
	public String getAname()
	{
		return aName;
	}
	public void setBalance(double b)
	{
		balance=b;
	}
	public double getBalance()
	{
		return balance;
	}
	
	
	public static void main(String[] args)
	{
		Account a=new Account();
		a.setAcno(100);
		a.setAname("Rutuja");
		a.setBalance(1000f);
		
		System.out.println("Account no:"+a.getAcno());
		System.out.println("Account Name"+a.getAname());
		System.out.println("Account Balance:"+a.getBalance());
				
		
	}

}
