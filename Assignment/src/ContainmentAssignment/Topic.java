package ContainmentAssignment;

public class Topic
{
	int tId;
	String tName;
	SubTopic subObj;
	
	Topic(int i,String n,SubTopic s)
	{
		tId=i;
		tName=n;
		subObj=s;
	}
	public String toString()
	{
		return tId+" "+tName+" "+subObj;
	}

}
