
public class Subtopic
{
	private int id;
	private String sName;
	private Topic tObj;
	
	public void setId(int i)
	{
		id=i;
	}
	public int getId()
	{
		return id;
	}
	public void setSName(String n)
	{
		sName=n;
	}
	public String getSName()
	{
		return sName;
	}
	public void setTObj(Topic o)
	{
		tObj=o;
	}
	public Topic getTObj()
	{
		return tObj;
	}
	public String toString()
	{
		return id+" "+sName+" "+tObj;
	}

}
