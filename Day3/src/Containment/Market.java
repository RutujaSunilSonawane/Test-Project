package Containment;

public class Market
{
	private String mName;
	private String mLocation;
	
	Market(String n,String l)
	{
		mName=n;
		mLocation=l;
	}
	Market()
	{
		
	}
	
	public void setMName(String n)
	{
		mName=n;
	}
	public String getMName()
	{
		return mName;
	}
	public void setMLocation(String l)
	{
		mLocation=l;
	}
	public String getMLocation()
	{
		return mLocation;
	}
	
	//Market(String n,String l)
	//{
	//	mName=n;
	//	mLocation=l;
	//}
	public String toString()
	{
		return mName+" " +mLocation;
	}

}
