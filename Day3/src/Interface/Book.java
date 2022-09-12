package Interface;

public class Book
{
	int bId,cost;
	String bName,aName;
	
	Book(int i,int c,String b,String a)
	{
		bId=i;
		cost=c;
		bName=b;
		aName=a;
	}
	public String toString()
	{
		return bId+" "+cost+" "+bName+" "+aName;
	}
	public void publish(String publication)
	{
		System.out.println("Magzine is publish:"+publication);
	}
}
