package Containment;

public class ManDepartment {

	public static void main(String[] args)
	{
		Maneger obj=new Maneger(123,"ABC",60000.00f);
		
		Department d=new Department(1234,"Computer Department",obj);
		
		System.out.println(d);
	

	}

}
