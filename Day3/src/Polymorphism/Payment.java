package Polymorphism;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CreditCard
	{
		public void doPayment(double qty)
		{
			System.out.println("Payment done!"+qty);
		}
	}
	class DebitCard
	{
		public void doPayment(double qty)
		{
			System.out.println("Payment done!"+qty);
			
		}
	}
	class NetBanking
	{
		public void doPayment(double qty)
		{
			System.out.println("Payment done!"+qty);
		}
	}
	public class Payment
	{
		public void Payment(CreditCard p)
		{
			p.doPayment(5000.0);
		}
		public void Payment(DebitCard p)
		{
			p.doPayment(5000.0);
			
		}
		public void Payment(NetBanking p)
		{
			p.doPayment(5000.0);
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
			p.Payment(c);
		}
		else if(choice.equals("DebitCard"))
		{
			DebitCard d=new DebitCard();
			p.Payment(d);
		}
		else
		{
			NetBanking n=new NetBanking();
			p.Payment(n);
		}

	}

}


