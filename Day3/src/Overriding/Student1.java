package Overriding;

public class Student1
{
	int roll;
	String name;
	
	public Student1(){
		
	}
	
	public  Student1(int r,String s)
	{
		roll=r;
		name=s;
	}
	public String toString()
	{
		return "Student1 Roll no:"+roll+"Student1 Name:"+name;
	}

	public static void main(String[] args) 
	{
		Student1 stu=new Student1(123,"Kajal");
		System.out.println("Hashcode od stu:"+stu.hashCode());
		System.out.println("Student Details are:"+stu);
	

	}

}
