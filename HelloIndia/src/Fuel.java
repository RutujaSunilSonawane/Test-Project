
public class Fuel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price=0, fuel=89;
		for(int i=1;i<=20;i++)
		{
			if(i>10)
			{
				price=i*(fuel-i);
				System.out.println("price for"+i+"barrel in="+price);
				
			}
			else
			{
				price=i*fuel;
				System.out.println("price for"+i+"barrel in="+price);
			}
		}
	}

}
