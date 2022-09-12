package Containment;

public class Student
{
	private int m1,m2,Id;
	private String sName;
	
	Student(int msk1,int msk2,int i,String n)
	{
		m1=msk1;
		m2=msk2;
		Id=i;
		sName=n;
	}
	Student()
	{
		
	}
	public void setM1(int msk1)
	{
		m1=msk1;
	}
	public int getM1()
	{
		return m1;
	}
	public void setM2(int msk2)
	{
		m2=msk2;
	}
	public int getM2()
	{
		return m2;
	}
	public void setId(int i)
	{
		Id=i;
	}
	public int getId()
	{
		return Id;
	}
	public void setSName(String n)
	{
		sName=n;
	}
	public String getSName()
	{
		return sName;
	}
	public String toString()
	{
		return m1+" "+m2+" "+Id+" "+sName;
	}

}
