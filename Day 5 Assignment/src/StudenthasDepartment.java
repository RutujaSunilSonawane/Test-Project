
public class StudenthasDepartment {

	public static void main(String[] args)
	{
		//Department d=new Department(12,"Computer Department");
		//Student s=new Student(1234,"Kajal",d);
		//System.out.println(s);
	//Setter Getter method
		
		Department d=new Department();
		d.setDId(12);
		d.setDName("Computer Department");
		
		Student s=new Student();
		s.setRoll(1234);
		s.setName("Kajal");
		s.setDObj(d);
		
		System.out.println(s);
		
		
		

	}

}
