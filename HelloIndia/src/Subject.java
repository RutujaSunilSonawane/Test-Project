
public class Subject 
{
	private int id;
	private String sName;
	private Branch bObj;
	
	
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
	public void setBObj(Branch o)
	{
		bObj=o;
	}
	public Branch getBObj()
	{
		return bObj;
	}
	public String toString()
	{
		return id+" "+sName+" "+bObj;
	}

}
