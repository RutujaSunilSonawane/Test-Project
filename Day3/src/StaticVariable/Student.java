package StaticVariable;

public class Student
{
	int sId;
	String sName;
	static String college="HAL Pravara Aviation Institute";
	
	
	Student(int i,String n)
	{
		sId=i;
		sName=n;
	}
	public void display()
	{
		System.out.println(sId+" "+sName+" "+college);
	}

}
