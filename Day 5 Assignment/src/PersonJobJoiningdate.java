
public class PersonJobJoiningdate {

	public static void main(String[] args)
	{
		/*Joiningdate j=new Joiningdate(2022,15,"August");
		  Job jObj=new Job(123,"Person Information",j);
		  Person p=new Person(12345,"Nikhil",jObj);
		  System.out.println(p);
		 */
		//Setter Getter method
		
		Joiningdate j=new Joiningdate();
		System.out.println("Person Information");
		j.setYear(2022);
		j.setDay(15);
		j.setMonth("August");
		Job jObj=new Job();
		jObj.setJobid(123);
		jObj.setProfile("Acadamic ");
		jObj.setJObj(j);
		
		Person p=new Person();
		p.setId(1234);
		p.setName("Nikhil");
		p.setJOObj(jObj);
		
		System.out.println(p);
		
	}

}
