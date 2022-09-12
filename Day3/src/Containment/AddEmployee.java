package Containment;

public class AddEmployee {

	public static void main(String[] args)
	{
		Address obj=new Address(123,421501,"Ganpati socity","Pune");
		
		Employee e=new Employee(1234,"Rutuja",60000.00f,obj);
		
		System.out.println(e);
	

	}

}
