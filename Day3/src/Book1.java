import java.io.PrintStream;

public class Book1 {
	
	private static Book1 Book2;
	int bid;
	float cost;
	String bName;

	public void acceptDetail(int id,float c,String bn)
	{
		bid=id;
		cost=c;
		bName=bn;
		
	}
	public void disp()
	{
		System.out.println(bid);
		System.out.println(cost);
		System.out.println(bName);
		
	}

	
	public static void main (String[] args)
	{
		Book1 b=new Book1();
		b.acceptDetail(76, 100.00f,"kk");
		b.disp();
		Book1 b1=new Book1();
		System.out.println("*******");
		Book1 b2=new Book1();
		
		b1.disp();
		b1.bid=b.bid;
		b1.cost=b.cost;
		b1.bName=b.bName;
		b1.disp();
		
		b2.disp();
		b2.bid=b.bid;
		b2.cost=b.cost;
		b2.bName=b.bName;
		b2.disp();
		b2=b1;
		System.out.println("hash code b1 object"+b1.hashCode());
		System.out.println("hash code b object"+b.hashCode());
		System.out.println("hash code b2 object"+b1.hashCode());
	}
	

	}
