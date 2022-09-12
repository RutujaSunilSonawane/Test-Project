package Containment;

public class Laptop
{
	private String brand;
	private int cost;
	private OpratingSystem osObj;
	
	public void setBrand(String b)
	{
		brand=b;
	}
	public String getBrand()
	{
		return brand;
	}
	public void setCost(int c)
	{
		cost=c;
	}
	public int getCost()
	{
		return cost;
	}
	public void setOSObj(OpratingSystem o)
	{
		osObj=o;
	}
	public OpratingSystem getOSObj()
	{
		return osObj;
	}
	
	
	/*Laptop(String b,int c,OpratingSystem os)
	{
		brand=b;
		cost=c;
		osObj=os;
	}*/
	public String toString()
	{
		return brand+" "+cost+" "+osObj;
	}

}
