package Containment;

public class EmployeeTest
{
	int empId,salary;
	String empName;
	
	EmployeeTest(int i,int s,String n)
	{
		empId=i;
		salary=s;
		empName=n;
	}
	public void showDetails()
	{
		System.out.print("Employee Id:"+empId+"Employee salary:"+salary+"Employee Name:"+empName);
		System.out.println();
	}
	public void maxSalary(EmployeeTest[] et)
	{
		int max=et[0].salary;
         
			for(int i=0;i<et.length;i++)
				 
		{
			if(et[i].salary>max)
			max=et[i].salary;
		}
		System.out.println("Employee with Highest salary:");
		for(int i=0;i<et.length;i++)
			 
		{
			if(et[i].salary==max)
				System.out.print(et[i].empId+" "+et[i].salary+" "+et[i].empName);
		}
	}
	
	
	public static void main(String[] args)
	{
		EmployeeTest[] et=new EmployeeTest[5];
		et[0]=new EmployeeTest(12,40000,"Kajal");
		et[1]=new EmployeeTest(13,50000,"Rushali");
		et[2]=new EmployeeTest(14,60000,"Sakshi");
		et[3]=new EmployeeTest(15,70000,"Nikhil");
		et[4]=new EmployeeTest(16,80000,"Rohit");
		
		
		System.out.println("Employee No 1");
		et[0].showDetails();
		System.out.println("Employee No 2");
		et[1].showDetails();
		System.out.println("Employee No 3");
		et[2].showDetails();
		System.out.println("Employee No 4");
		et[3].showDetails();
		System.out.println("Employee No 5");
		et[4].showDetails();
		
		et[0].maxSalary(et);
		//et[1].maxSalary(et);
		//et[2].maxSalary(et);
		//et[3].maxSalary(et);
		//et[4].maxSalary(et);
		
		
	}
	
	
}



