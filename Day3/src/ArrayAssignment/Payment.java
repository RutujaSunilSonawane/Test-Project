package ArrayAssignment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CreditCard
	{
		public void doPayment()
		{
			System.out.println("You got 15% discount on bill on creditCard transaction");
		}
	}
	class DebitCard
	{
		public void doPayment()
		{
			System.out.println("No discount on bill on debitCard transaction");
			
		}
	}
	
	
	public class Payment
	{
		public void Payment(CreditCard p)
		{
			p.doPayment();
		}
		public void Payment(DebitCard p)
		{
			p.doPayment();
			
		}
		

	public static void main(String[] args)
	{
		Payment p=new Payment();
		System.out.println("Select Payment OPtion");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String choice=null;
		try{
			choice =br.readLine();
		}catch (IOException e) {
			e.printStackTrace();
			
		}
		if(choice.equals("CreditCard"))
		{
			CreditCard c=new CreditCard();
			
		
		}
		else
		{
			DebitCard d=new DebitCard();
		
		}
		

	}

}







