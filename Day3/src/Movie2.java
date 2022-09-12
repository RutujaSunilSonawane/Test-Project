
public class Movie2
{
	int yearOfRelease;
	float profit;
	String producerName,actorName;
	public void acceptDetails() 
	{
		yearOfRelease=2019;
		profit=200000.00f;
		producerName="Mr.Ronnie";
		actorName="Vki Kaushal";
		
	}
	public void showDetails()
	{
		System.out.println("Movie profit is:"+profit);
		System.out.println("movie producerName:"+producerName);
		System.out.println("movie actorName"+actorName);
		System.out.println("movie yearOfRelease:"+yearOfRelease);
	}
	public static void main (String[]args)
	{
		Movie2 uri=new Movie2();
		uri.acceptDetails();
		uri.showDetails();
		
	}
	
	
}
