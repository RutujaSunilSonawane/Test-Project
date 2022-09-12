package Containment;

public class Shop
{
	private String sName,sLocation;
	private int sNo;
	private Market mObj;
	
	
	public void setSName(String n)
	{
		sName=n;
	}
	public String getSName()
	{
		return sName;
	}
	public void setSLocation(String l)
	{
		sLocation=l;
	}
	public String getSLocation()
	
	{
		return sLocation;
	}
	public void setSNo(int s)
	{
		sNo=s;
	}
	public int getSNo()
	{
		return sNo;
	}
	public void setMObj(Market m)
	{
		mObj=m;
	}
	public Market getMObj()
	{
		return mObj;
	}
	
	//Shop(String n,String l,int sn,Market o)
	//{
		//sName=n;
		//sLocation=l;
		//sNo=sn;
		//mObj=o;
	//}
	public String toString()
	{
		return sName+" "+sLocation+" "+sNo+" "+mObj;
	}
	

}
