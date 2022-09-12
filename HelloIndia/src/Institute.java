
public class Institute
{
	private int Id;
	private String iName;
	
	public void setId(int i)
	{
		Id=i;
	}
	public int getId()
	{
		return Id;
	}
	public void setIName(String n)
	{
		iName=n;
	}
	public String getIName()
	{
		return iName;
	}
	public String toString()
	{
		return Id+" "+iName;
	}

}
