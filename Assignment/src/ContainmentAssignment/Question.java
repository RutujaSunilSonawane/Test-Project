package ContainmentAssignment;

public class Question
{
	int qId;
	String qName;
	
	Question(int i,String n)
	{
		qId= i;
		qName=n;
	}
	public String toString()
	{
		return qId+" "+qName;
	}

}
