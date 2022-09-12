package Inheritance;

class College
{
	int cId;
	String cName;
	
	public void college(int i,String n)
	{
		cId=i;
		cName=n;
		System.out.println("College id:"+cId);
		System.out.println("College name:"+cName);
	}
}
class Student1 extends College
{
	int sId;
	String sName;
	
	public void student(int i,String n)
	{
		sId=i;
		sName=n;
		System.out.println("Student id:"+sId);
		System.out.println("Student name:"+sName);
	}
}
class Person1 extends College
{
	int pId;
	String pName;
	
	public void person(int i,String n)
	{
		pId=i;
		pName=n;
		System.out.println("person id:"+pId);
		System.out.println("person name:"+pName);
	}
}

public class Institute {

	public static void main(String[] args)
	{
		Person1 p=new Person1();
		System.out.println("Person Information");
		p.person(11,"Nikhil");
		System.out.println("College Informatoin");
		p.college(12, "Rutuja");
		

	}

}
