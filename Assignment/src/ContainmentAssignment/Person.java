package ContainmentAssignment;

public class Person {
	String name,gender;
	int age;
	Address ads;
	
	Person(String n,String g,int a,Address ad)
	{
		name=n;
		gender=g;
		age=a;
		ads=ad;
	}
	public String toString()
	{
		return name+" "+gender+" "+age+" "+ads;
	}

}
