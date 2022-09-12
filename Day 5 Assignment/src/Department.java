
public class Department
{
	private int dId;
	private String dName;
	
	public void setDId(int i)
	{
		dId=i;
	}
	public int getDId()
	{
		return  dId;
	}
	public void setDName(String n)
	{
		dName=n;
	}
	public String getDName()
	{
		return dName;
	}
	
	/*Department(int i,String n)
	{
		dId=i;
		dName=n;
	}*/
	
	public String toString()
	{
		return dId+"  "+dName;
		
	}

}
