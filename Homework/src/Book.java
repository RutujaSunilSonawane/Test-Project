
public class Book 
{
	int bPrice;
	String aName,bName;
	public void acceptDetails(int bP,String aN,String bN)
	{
		bPrice=bP;
		aName=aN;
		bName=bN;
	}
	public void showDetails()
	{
		System.out.println("Book Price"+bPrice);
		System.out.println("Author Name:"+aName+"Book Name:"+bName);
	}
}
