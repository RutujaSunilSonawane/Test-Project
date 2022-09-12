
public class StudentHashcode 
{
	int id;
	String name;
	
	
	StudentHashcode(int i,String n)
	{
		id=i;
		name=n;
	}
	public String toString()
	{
		return id+" "+name;
	}
	

	public static void main(String[] args) {
		StudentHashcode s=new StudentHashcode(12,"Kajal");
		System.out.println("Student 1 Information:"+s);
		System.out.println("Hashcode s:"+s.hashCode());
		StudentHashcode s1=new StudentHashcode(13,"Rushali");
		System.out.println("Student 2 Information:"+s1);
		System.out.println("Hashcode s1:"+s1.hashCode());
		
	}

}
