package StaticVariable;

public class Employee

{
	int eId;
	String eName;
	static String company="tata company";
	
	static void change()
	{
		company="Air India";
	}
	
	Employee(int i,String n)
	{
		eId=i;
		eName=n;
	}
	public void display()
	{
		System.out.println(eId+" "+eName+" "+company);
		
	}

}

