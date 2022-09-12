package ContainmentAssignment;

public class StudenthasDepartment
{

	public static void main(String[] args) 
	{
		Student s=new Student(123,"Rutuja");
		Department d=new Department(1234,"Computer Department",s);
		
		System.out.println(d);


	}

}
