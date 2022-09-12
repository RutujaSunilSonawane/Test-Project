package ContainmentAssignment;

public class Branch
{
	int bId;
	String bName;
	Subject sObj;
	
	Branch(int i,String n,Subject s)
	{
		bId=i;
		bName=n;
		sObj=s;
	}
	public String toString()
	{
		return bId+" "+bName+" "+sObj;
	}
}
