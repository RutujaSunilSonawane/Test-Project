
public class Student 
{
	private int roll;
	private String name;
	private Department dObj;
	
	
	public void setRoll(int r)
	{
		roll=r;
	}
	public int getRoll()
	{
		return roll;
	}
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	public void setDObj(Department o)
	{
		dObj=o;
	}
	public Department getDObj()
	{
		return dObj;
	}
/*	Student(int r,String nm,Department o)
	{
		roll=r;
		name=nm;
		dObj=o;
	}*/
	
	public String toString()
	{
		return roll+" "+name+" "+dObj;
		
	}

}
