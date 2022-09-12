package ContainmentAssignment;

public class SubTopic 
{
	int sId;
	String sName;
	Question qObj;
	
	SubTopic(int i,String n ,Question q)
	{
		sId=i;
		sName=n;
		qObj=q;
		
	}
	public String toString()
	{
		return sId+" "+sName+" "+qObj;
	}

}
