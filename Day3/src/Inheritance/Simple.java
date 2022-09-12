package Inheritance;

class Person
{
	int age ,id;
	String name;
	
	public void person(String name,int id,int age)
	{
		System.out.println("Person name:"+name);
		System.out.println("Person id:"+id);
		System.out.println("Person age:"+age);
	}
}
class Student extends Person
{
	int age ,id;
	String name;
	
	public void student(String name,int id,int age)
	{
		System.out.println("Student Name:"+name);
		System.out.println("Student id:"+id);
		System.out.println("Student age:"+age);
	}
}

public class Simple {

	public static void main(String[] args)
	{
		Student s=new Student();
		System.out.println("Person Information");
		s.person("Nikhil", 100, 22);
		System.out.println("Student Information");
		s.student("Rutuja", 101, 22);
	}

}
