package Inheritance;

class Manager
{
	int mId;
	String mName;
	float mSalary;
	
	public void manager(int i,String n,float s)
	{
		mId=i;
		mName=n;
		mSalary=s;
		
		System.out.println("Manager id:"+mId);
		System.out.println("Maneger name:"+mName);
		System.out.println("Manager salary:"+mSalary);
	}
}
class Employee extends Manager
{
	int eId;
	String eName;
	float eSalary;
	
	public void employee(int i,String n,float s)
	{
		eId=i;
		eName=n;
		eSalary=s;
		System.out.println("Employee id:"+eId);
		System.out.println("Employee name:"+eName);
		System.out.println("Employee Salary:"+eSalary);
	}
}

public class Company 
{

	public static void main(String[] args)
	{
		Employee e=new Employee();
		System.out.println("Manager Information");
		e.manager(102,"Nikhil",60000);
		System.out.println("Employee Information");
		e.employee(103,"Rutuja",50000);
	

	}

}
