package ContainmentAssignment;

public class Dept
{
	int dId;
	String dName;
	
	Dept(int i,String n)
	{
		dId=i;
		dName=n;
	}
	public String toString()
	{
		return dId+" "+dName;
	}

}
