
public class Account
{
	int accNo;
	double balance;
	String accholderName;
	static int ifc=1234;
	
	Account()
	{
		accNo=123;
		balance=5000;
		accholderName="xyz";
	}
	Account(int n,double b,String s)
	{
		accNo=n;
		balance=b;
		accholderName=s;
	}
	public String toString()
	{
		return accNo+" "+balance+" "+accholderName;
	}
	public void showDetails()
	{
		System.out.println("Account no:"+accNo);
		System.out.println("Balance:"+balance);
		System.out.println("accholderName:"+accholderName);
		System.out.println("ifc:"+ifc);
	}
	public static void main(String[] args)
	{
		Account a=new Account();
		a.showDetails();

	}

}
