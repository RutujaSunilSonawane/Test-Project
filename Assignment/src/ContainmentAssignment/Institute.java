package ContainmentAssignment;

public class Institute 
{
	int iId;
	String iName;
	Branch bObj;
	
	Institute(int i,String n,Branch b)
	{
		iId=i;
		iName=n;
		bObj=b;
	}
	public String toString()
	{
		return iId+" "+iName+" "+bObj;
	}

}
