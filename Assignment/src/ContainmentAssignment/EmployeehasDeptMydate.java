package ContainmentAssignment;

public class EmployeehasDeptMydate {

	public static void main(String[] args)
	{
		Dept d=new Dept(11,"Computer Department");
		Mydate m=new Mydate(2022,"Monday","Noveber");
		Employee e=new Employee(12,"Rutuja",60000.00,d,m);
		
		System.out.println("Employee Information");
		System.out.println(e);
		

	}

}
