package Inheritance;

class Manager1
{
	int mId;
	String mName;
	float mSalary;
	
	public void  manager(int i,String n,float s)
	{
		mId=i;
		mName=n;
		mSalary=s;
		System.out.println("Manager Id:"+mId);
		System.out.println("Manager name:"+mName);
		System.out.println("Manager salary:"+mSalary);
	}
}
class Supervisor extends Manager1
{
	int sId;
	String sName;
	float sSalary;
	
	public void supervisor(int i,String n,float s)
	{
		sId=i;
		sName=n;
		sSalary=s;
		System.out.println("Supervisor id:"+sId);
		System.out.println("Supervisor name:"+sName);
		System.out.println("Supervisor salary:"+sSalary);
	}
}
class Employee1 extends Supervisor
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
		System.out.println("Employee salary:"+eSalary);
	}
}
public class Department {

	public static void main(String[] args) 
	{
		Employee1 e=new Employee1();
		System.out.println("Employee Information");
		e.employee(11, "Kajal",300000);
		System.out.println("Supervisor Information");
		e.supervisor(12, "Rushali", 50000);
		System.out.println("Manager Information");
		e.manager(13, "Rutuja",70000);
				
		

	}

}
