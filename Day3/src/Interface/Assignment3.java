package Interface;

import java.util.Scanner;

interface  TaxPayer
{
	void payTax();
}
class Person
{
	String name,address;
	int age;
	public void getDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name=");
		name=sc.nextLine();
		System.out.println("Enter Address=");
		address=sc.nextLine();
		System.out.println("Enter age=");
		age=sc.nextInt();
		sc.close();
	}
	public void showDetails()
	{
		System.out.println("******Person Details*******");
		System.out.println("Person name:"+name);
		System.out.println("Person Address:"+address);
		System.out.println("Person age:"+age);
	}
}
class Employee extends Person1 implements TaxPayer
{
	int empid;
	float basic,hra,da,grossSalary;
	Employee()
	{
		
	}
	Employee(int empid,float basic,float hra,float da)
	{
		this.empid=empid;
		this.basic=basic;
		this.hra=hra;
		this.da=da;
		
	}
	
	public void calculateSalary()
	{
		grossSalary=basic +hra+da;
	}
	public void showEmpDeatils()
	{
		System.out.println("****Salary Details*****");
		System.out.println("Employee Id:"+empid);
		System.out.println("Basic:"+basic);
		System.out.println("Dearness Allowance:"+da);
		System.out.println("House Rent Allowance:"+hra);
		System.out.println("Gross Salary:"+grossSalary);
	}
	public void payTax()
	{
		System.out.println("Your Tax payable amount is"+(grossSalary*0.2));
		
	}
}
class VP extends Employee
{
	double bonus=8000;
	double totalSalary;
	
	VP()
	{
		super(12,50000.0f,2800.0f,1800.0f);
		super.calculateSalary();
	}
	public void calculateSalary()
	{
		totalSalary=grossSalary+bonus;
		System.out.println("Total salary:"+totalSalary);
	}
}
public class Assignment3 
{
	public static void main(String[] args)
	{
		VP v=new VP();
		System.out.println("For person Details");
		//v.getDetails();
		//v.showDetails();
		
		System.out.println("For salary Details");
		v.showEmpDeatils();
		v.payTax();
		v.calculateSalary();

	}

}
