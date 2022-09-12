package ContainmentAssignment;

public class PersonhasAddress {

	public static void main(String[] args)
	{
		Address a=new Address("Nashik","Maharastra","India");
		Person p=new Person("Rutuja","Female",22,a);
		
		System.out.println(p);

	}

}
