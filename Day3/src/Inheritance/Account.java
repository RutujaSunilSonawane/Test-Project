package Inheritance;

public class Account 
{
	int accId;
	String custName;
	float balance;
	
	Account()
	{
		accId=500;
		custName="Rutuja";
		balance=50000.00f;
	}
	Account(int a,String c,float b)
	{
		accId=a;
		custName=c;
		balance=b;
	}
	public void openAccount(int a,String c,float b)
	{
		accId=a;
		custName=c;
		balance=b;
		
	}
	public void showAccountDetails()
	{
		System.out.println("Interested");
		System.out.println("Aoount id"+accId+"custName:"+custName+"balance:"+balance);
		
	}

}
class SavingAccount extends Account
{
	float iRate;
	
	SavingAccount()
	{
		super(500,"Rutuja",50000);
		iRate=5.5f;
	}
	SavingAccount(float r)
	{
		iRate=r;
	}
	public void openAccount(int a,String c,float b)
	{
		System.out.println("Saving account");
		accId=a;
		custName=c;
		balance=b;
	}
	public void depositAmount()
	{
		
		System.out.println("*******depositeAmount******");
		System.out.println("Deposite amount:"+iRate);
		
		
	}
	public void withdrawAmount()
	{
		System.out.println("withdraw amount");
		System.out.println("withdraw amount:"+iRate);
		
	}
}
