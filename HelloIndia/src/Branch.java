
public class Branch 
{
	private int id;
	private String bName;
	private Institute iObj;
	
	public void setId(int i)
	{
		id=i;
	}
	public int getId()
	{
		return id;
	}
	public void setBName(String n)
	{
		bName=n;
	}
	public String getBName()
	{
		return bName;
	}
	public void setIObj(Institute o)
	{
		iObj=o;
	}
	public Institute getIObj()
	{
		return iObj;
	}
	public String toString()
	{
		return id+" "+bName+" "+iObj;
	}

}
