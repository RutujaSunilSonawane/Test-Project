
public class University
{
	String uName;
	College cObj;
	
	University(String n,College c)
	{
		uName=n;
		cObj=c;
	}
	public String toString()
	{
		return uName+"  "+cObj;
	}

}
