package Containment;

public class OpratingSystem 
{
	private String osName,vendor;
	private double version;
	
	
	public void setOSName(String n)
	{
		osName=n;
	}
	public String getOSName()
	{
		return osName;
	}
	public void setVendor(String v)
	{
		vendor=v;
	}
	public String getVendor()
	{
		return vendor;
	}
	public void setVersion(double ver)
	{
		version=ver;
	}
	public double getVersion()
	{
		return version;
	}
	/*OpratingSystem(String n,String v,double d)
	{
		osName=n;
		vendor=v;
		version=d;
	
	}*/
	
	public String toString()
	{
		return osName+" "+vendor+" "+version;
	}
	

}
