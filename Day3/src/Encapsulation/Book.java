package Encapsulation;

public class Book
{
	private int bId,bPrice;
	private String bName,bAuthrName;
	
	
	public void setBid(int bids)
	{
		bId=bids;
	}
	public int getBids()
	{
		return bId;
	}
	public void setBprice(int bprice)
	{
		bPrice=bprice;
	}
	public int getBprice()
	{
		return bPrice;
	}
	public void setBname(String bnm)
	{
		bName=bnm;
	}
	public String getBname()
	{
		return bName;
	}
	public void setBauthrname(String bAuthrname)
	{
		bAuthrName=bAuthrname;
	}
	public String getBauthrname()
	{
		return bAuthrName;
	}

	public static void main(String[] args)
	{
		
		Book b=new Book();
		b.setBid(12);
		b.setBprice(80);
		b.setBname("Pawankhind");
		b.setBauthrname("xyz");
		
		
		System.out.println("Book Id:::"+b.getBids());
		System.out.println("Book Price:::"+b.getBprice());
		System.out.println("Book Name:::"+b.getBname());
		System.out.println("Book Authre Name:::"+b.getBauthrname());
		
		
		

	}

}
