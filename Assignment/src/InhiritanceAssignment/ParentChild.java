package InhiritanceAssignment;

/*Create a class with display() method that prints "This is parent class" and its
subclass with another view() method that prints "This is child class". Now,
create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class*/
class Parent
{
	 int age;
	 String name;
	
	public void parent(int a,String n)
	{
		age=a;
		name=n;
		System.out.println("This is the Parent class");
		System.out.println("Parent age:"+age);
		System.out.println("Parent Name:"+name);
	}
}

class Child extends Parent
{
	int age;
	String name;
	
	public void child(int a,String n)
	{
		age=a;
		name=n;
		
		System.out.println("This is the Child Class");
		System.out.println("Child age:"+age);
		System.out.println("Child name:"+name);
	}
}

public class ParentChild
{

	public static void main(String[] args)
	{
		Parent p=new Parent();
		p.parent(48, "Sunil");
		
		Child c=new Child();
		c.child(5, "Rushali");
		c.parent(48, "Sunil");
		

	}

}
