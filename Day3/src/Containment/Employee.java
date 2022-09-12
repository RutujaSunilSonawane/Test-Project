package Containment;

public class Employee
{
	int empId;
	String empName;
	float empSalary;
   	Address addr;
   	
   	Employee(int i,String n,float s,Address a)
   	{
   		empId=i;
   		empName=n;
   		empSalary=s;
   		 addr = a;
   	}
   	public String toString()
   	{
   		return empId+" "+empName+" "+empSalary+" "+addr;
   	}

}
