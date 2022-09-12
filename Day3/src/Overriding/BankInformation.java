package Overriding;

 class Banking
{
	protected void doTransaction()
	{
		System.out.println("Transaction done by being in queue in Bank");
		}
}
class OnlineBanking extends Banking
{
	public void doTransaction()
	{
		super.doTransaction();
		System.out.println("Transaction Done Online");
	}
}

public class BankInformation 
{

	public static void main(String[] args)
	{
		OnlineBanking ob=new OnlineBanking();
		ob.doTransaction();

	}

}
