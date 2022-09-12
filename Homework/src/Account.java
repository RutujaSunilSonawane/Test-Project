
public class Account 
{
	int no;
	String name;
	double balance;
	public void acceptDetails(int acno,String n,double b)
	{
		no=acno;
		name=n;
		balance=b;
		
	}
	public void showDetails()
	{
		System.out.println("Account Number:"+no);
		System.out.println("Account Name:"+name);
		System.out.println("Account balance:"+balance);
	}
}
