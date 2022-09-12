package constructor;

public class Movie
{
	int yearOfRelease;
	float profit;
	String producerName,actorName;
	
	Movie()
	{
		yearOfRelease=1997;
		profit=120000f;
		producerName="Leonardo";
		actorName="Mr.James";			
	}
	Movie(int y,float p,String pr,String a)
	{
		yearOfRelease=y;
		profit=p;
		producerName=pr;
		actorName=a;
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
		System.out.println("Movie yearOfRelease:"+yearOfRelease);
		System.out.println("Movie profit:"+profit);
		System.out.println("Mover producerName:"+producerName);
		System.out.println("Movie actorName:"+actorName);
	}

	public static void main(String[] args)
	{
		Movie titanic=new Movie();
		//titanic.acceptDetails(1997,120000f,"Leonardeo","Mr.James");
		System.out.println("titanic object created & value initilized in that object");
		titanic.showDetails();
		
		
		Movie uri=new Movie();
		//uri.acceptDetails(2019,100000f,"Ronni","Viki Kaushal");
		System.out.println("Uri object created & value inilized in that object");
		uri.showDetails();

	}

}
