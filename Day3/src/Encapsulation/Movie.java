package Encapsulation;

public class Movie
{
	private int yearOfRelease;
	private String producerName,actorName;
	private float profit;
	
	public void setYearOfRelease(int y)
	{
		yearOfRelease=y;
	}
	public int getYearOfRelease()
	{
		return yearOfRelease;
	}
	public void setProfit(float p)
	{
		profit= p;
	}
	public float getProfit()
	{
		return profit;
	}
	public void setProducerName(String pr)
	{
		producerName=pr;
	}
	public String getProducerName()
	{
		return producerName;
	}
	public void setActorName(String n)
	{
		actorName=n;
	}
	public String getActorName()
	{
		return actorName;
	}
	public static void main(String[] args)
	{
		Movie m=new Movie();
		m.setYearOfRelease(1997);
		m.setProfit(120000f);
		m.setProducerName("Leonardo");
		m.setActorName("Mr.James");
		
		System.out.println("Movie yearOfRelease:"+m.getYearOfRelease());
		System.out.println("Movie profit:"+m.getProfit());
		System.out.println("Movie producer name:"+m.getProducerName());
		System.out.println("Movie actorName:"+m.getActorName());
		

	}

}
