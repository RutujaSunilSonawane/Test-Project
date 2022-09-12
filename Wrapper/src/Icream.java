enum Softy
{
	VANILLA(30,50),MANGO(40,50),BUTTERSCTOCH;
	int price;
	int qty;
	Softy(){
		
	}
	Softy(int c,int q)
	{
		price=c;
		qty=q;
	}
	public void getTotatBill()
	{
		int totalBill=price*qty;
		System.out.println(totalBill);
	}
}
public class Icream {

	public static void main(String[] args) {
		

	}

}
