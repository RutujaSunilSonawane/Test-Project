package constructor;

public class Book1 
{
	int bPrice;
	String bName,aName;
	
	Book1()
	{
		this(500,"Science","Newton");
		bPrice=500;
		bName="Panipat";
		aName="APJ";
	}
	Book1(int bPrice,String bName,String aName)
	{
		this.bPrice=bPrice;
		this.bName=bName;
		this.aName=aName;
	}
	/*public void acceptDetails(int bp,String bN,String aN)
	{
		bPrice=bp;
		bName=bN;
		aName=aN;
	}*/
	public void showDetails()
	{
		System.out.println("Book price:"+bPrice);
		System.out.println("Book Name:"+bName);
		System.out.println("Book Author Name:"+aName);
	}
	

	public static void main(String[] args)
	{
		Book1 b=new Book1();
		System.out.println("b object created & value initilized in that object");
		b.showDetails();
		
		Book1 b1=new Book1();
		System.out.println("b1 object created & value initilized in that object ");
		b1.showDetails();
	

	}

}
