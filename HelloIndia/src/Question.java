
public class Question
{
	private int id;
	private String qName;
	private Subtopic subObj;
	
	public void setId(int i)
	{
		id=i;
	}
	public int getId()
	{
		return id;
	}
	public void setQName(String n)
	{
		qName=n;
	}
	public String getQName()
	{
		return qName;
	}
	public void setSubObj(Subtopic sub)
	{
		subObj=sub;
	}
	public Subtopic getSubObj()
	{
		return subObj;
	}
	public String toString()
	{
		return id+" "+qName+" "+subObj;
	}

}
