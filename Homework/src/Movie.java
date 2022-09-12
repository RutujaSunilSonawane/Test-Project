
public class Movie
{
	int yearOfRelease;
	float profit;
	String producerName,actorName;
	
	Movie()
	{
		yearOfRelease=2019;
		profit=120000f;
		producerName="Leonardo";
		actorName="Mr.James";
	}
	public void acceptDetails(int y,float p,String pr,String a)
	{
		yearOfRelease=y;
		profit=p;
		producerName=pr;
		actorName=a;
	}
	public void showDetails()
	{
		System.out.println("Movei yearOfRelease:"+yearOfRelease);
		System.out.println("movie profit:"+profit);
		System.out.println("movie producerName:"+producerName);
		System.out.println("movie actorName:"+actorName);
	}
	
}
