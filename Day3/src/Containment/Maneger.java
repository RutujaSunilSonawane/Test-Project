package Containment;

public class Maneger
{	
	int mId;
	String mName;
	float mSalary;
	
	Maneger(int i,String n,float s)
	{
		mId=i;
		mName=n;
		mSalary=s;
	}
	public String toString()
	{
		return mId+" "+mName+" "+mSalary;
	}

}
