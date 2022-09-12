package ContainmentAssignment;

public class Student 
{
	int sId;
	String sName;
	
	Student(int i,String n)
	{
		sId=i;
		sName=n;
	}
	public String toString()
	{
		return sId+" "+sName;
	}

}
