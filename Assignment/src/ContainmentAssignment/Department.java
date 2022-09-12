package ContainmentAssignment;

public class Department 
{
	int dId;
	String dName;
	Student std;
	
	Department(int i,String n,Student s)
	{
		dId=i;
		dName=n;
		std=s;
	}
	public String toString()
	{
		return dId+" "+dName+" "+std;
	}

}
