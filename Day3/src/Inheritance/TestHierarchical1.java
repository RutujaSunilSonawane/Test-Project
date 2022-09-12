 package Inheritance;

 class GrandFather
{
	int srvNo;
	String surname;
	
	GrandFather()
	{
		System.out.println("this is the default constructor grandfather");
		srvNo=70;
		surname="Sonawane";
		
		
	}
	
	public void grandFather(int i,String n)
	{
		srvNo=i;
		surname=n;
		System.out.println("Grandfather age:"+srvNo);
		System.out.println("Grandfather name:"+surname);
		
	}
}

class Father extends GrandFather
{
	int age;
	String name;
	
	Father()
	{
		System.out.println("this is the default constructor Father");
		age=50;
		name="Sunil";
		
	}
	
	public void father(int i,String n)
	{
		age=i;
		name=n;
		System.out.println("Father age:"+age);
		System.out.println("Father name:"+name);
	}
}

class Son extends GrandFather
{
	int age;
	String name;
	
	Son()
	{
		System.out.println("this is the default constructor son");
		age=22;
		name="Nikhil";
		
	}
	
	public void son(int i,String n)
	{
		age=i;
		name=n;
		System.out.println("Son age:"+age);
		System.out.println("Son name:"+name);
	}
}

public class TestHierarchical1 {

	public static void main(String[] args) 
	{
		Son s=new Son();
		System.out.println("Son Information");
		//s.son(22, "Nikhil");
	System.out.println("GrandFather Information");
		//s.grandFather(75, "Sonawane");
		

	}

}
