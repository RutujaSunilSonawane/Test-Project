package constructor;

public class Account1
{
	int acNo;
	String acName;
	double balance;
	
	Account1()
	{
		acNo=100;
		acName="Rutuja";
		balance=1000.00;
		
	}
	Account1(int n,String nm,double b)
	{
		acNo=n;
		acName=nm;
		balance=b;
	}
	public void acceptDetails(int n,String nm,double b)
	{
		acNo=n;
		acName=nm;
		balance=b;
	}
	public void showDetails()
	{
		System.out.println("Account number:"+acNo);
		System.out.println("Account Name:"+acName);
		System.out.println("Account balance:"+balance);
	}

	public static void main(String[] args)
	{
		Account1 a=new Account1();
		System.out.println("a object created &value initilized in that object");
		a.showDetails();
		
		Account1 a1=new Account1(123,"Nikhil",123.0);
		System.out.println("a1 object created & value initilized in that object");
		a1.showDetails();
		

	}

}
