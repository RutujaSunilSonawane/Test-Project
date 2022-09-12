package AssignmentOOPS;

public class ConstructorExample
{
	String empName;
	int empId;
	ConstructorExample()//Default Constructor
	{
		empName="Rutuja";
		empId=102;
	}
	ConstructorExample(String empName,int empId)//parameterized constructor
	{
		this.empName=empName;
		this.empId=empId;
	}
	public void show()
	{
		System.out.println(empName);
		System.out.println(empId);
	}

	public static void main(String[] args)
	{
		ConstructorExample obj=new ConstructorExample("Nikhil",102);
		ConstructorExample obj1=new ConstructorExample();
		obj1.show();
		obj.show();

	}

}
