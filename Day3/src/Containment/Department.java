package Containment;

public class Department
{
	int dId;
	String dName;
	Maneger mObj;
	
	Department(int i,String n, Maneger m)
	{
		dId=i;
		dName=n;
		mObj=m;
	}
	public String toString()
	{
		return dId+" "+dName+" "+mObj;
	}

}
