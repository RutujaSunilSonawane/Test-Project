
public class Topic
{
	private int id;
	private String tName;
	private Subject sObj;
	
	
	public void setId(int i)
	{
		id=i;
	}
	public int getId()
	{
		return id;
	}
	public void setTName(String n)
	{
		tName=n;
	}
	public String getTName()
	{
		return tName;
	}
	public void setSObj(Subject o)
	{
		sObj=o;
	}
	public Subject getSObj()
	{
		return sObj;
	}
	public String toString()
	{
		return id+" "+tName+" "+sObj;
	}

}
