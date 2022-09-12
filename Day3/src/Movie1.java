
public class Movie1
{
	int yearOfRelease;
	float profit;
	String producerName,actorName;
	
	
	Movie1()     //Default constructor
	{
		yearOfRelease=1997;
		profit=120000f;
		producerName="Leonardo";
		actorName="Mr.james";
		
	}
	
	
	Movie1(int y,float p,String pr,String a)     //Parameterized constructor
	{
		yearOfRelease=y;
		profit=p;
		producerName=pr;
		actorName=a;
		
	}
	void acceptDetails(int y,float p,String pr,String a)
	{
		yearOfRelease=y;
		profit=p;
		producerName=pr;
		actorName=a;
		
	}
	void showDetails()
	{
		System.out.println("Movie profit is Rs."+profit);
		System.out.println("movie producerName"+producerName);
		System.out.println("movie actorName"+actorName);
		System.out.println("Movie yearOfRelease"+yearOfRelease);
		
	}
	public static void main(String[] args)
	{
		Movie1 titanic=new Movie1();
		//titanic.acceptDetails(1997,120000f, "Leonardo", "Mr.james");
		System.out.println("titanic object created and values initialized in object");
		titanic.showDetails();
		
		  
		Movie1 uri=new Movie1(2019,100000f,"Ronni","Viki Kaushal");
		//uri.acceptDetails(2019,100000f,"Ronni","Viki Kaushal");
		System.out.println("uri object created and values initialized in object");
		uri.showDetails();
		
	}

}
