package Containment;

public class Institute 
{
	private String iName,iLocation;
	private Student std;
	
	Institute(String l,String n,Student s)
	{
		iLocation=l;
		iName=n;
		std=s;
	}
	Institute(String n,String l)
	{
		iName=n;
		iLocation=l;
		std=new Student(96,95,100,"rutuja");
	}
	
	public void setIName(String n)
	{
		iName=n;
	}
	public String getIName()
	{
		return iName;
	}
	public void setILocation(String l)
	{
		iLocation=l;
	}
	public String getILocation()
	{
		return iLocation;
	}
	public void setStd(Student s)
	{
		std=s;
	}
	public Student getStd()
	{
		return std;
	}
	public String toString()
	{
		return iName+" "+iLocation+" "+std;
	}
	
	

}
