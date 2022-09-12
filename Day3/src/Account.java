import java.util.Scanner;

public class Account
 {
	int no;
	String name;
	double balance;
	public void openAccount(String nm,int accno,double b)
	{
		no=accno;
		name=nm;
		balance=b;
		
	}
	public void showAccountDetails()
	{
		System.out.println("******showAccountDetails*******");
		System.out.println("Account no:: "+no+"\nHolder Name ::"+name+"\nBalance::"+balance+"\n");
	}
	public void depositeAmount(double amount)
	{
		balance=balance+amount;
		System.out.println("*******depositeAmount******");
		System.out.println("DepositeBalanmce::"+amount+"\n Balance::"+balance+"\n");
	}
	public void withdrawAmount(double amount)
	{
		if(balance>amount)
		{
			balance=balance-amount;
			System.out.println("********withdrawAmount*******");
			System.out.println("withdrawAmount::"+amount+"\n Balance::"+balance+"\n");
		}
		else
		{
			System.out.println("Insufficient");
			
		}
	}
		public void ShowUpdatedBalance()
		{
			System.out.println("******ShowUpdatedBalance*******");
			System.out.println("Account No::"+no+"\nHolder Name::"+name+"\nUpdatedBalance::"+balance+"\n");
			
		}
		public static void main (String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter user name::");
			String name=sc.nextLine();
			System.out.println("Enter account number");
			int acno=sc.nextInt();
			System.out.println("Enter balance::");
			double amount=sc.nextDouble();Account a=new Account();
			a.openAccount(name, acno, amount);
			a.showAccountDetails();
			
			
			System.out.print("Enter the Amount of Deposite");
			double dep=sc.nextDouble();
			a.depositeAmount(dep);
			
			
			System.out.print("Enter the amount of withdraw::");
			double wid=sc.nextDouble();
			a.withdrawAmount(wid);
			
			
			a.ShowUpdatedBalance();
			sc.close();
					
		}
	
}
