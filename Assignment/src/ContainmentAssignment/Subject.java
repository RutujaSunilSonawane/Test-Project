package ContainmentAssignment;

public class Subject 
{
	int sId;
	String sName;
	Topic tObj;
	
	Subject(int i,String n,Topic t)
	{
		sId=i;
		sName=n;
		tObj=t;
	}
	public String toString()
	{
		return sId+" "+sName+" "+tObj;
	}

}
