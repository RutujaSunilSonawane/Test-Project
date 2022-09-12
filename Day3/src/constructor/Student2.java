package constructor;

public class Student2 
{
	int m1,m2, rollNo;
	String name;
	
	Student2()
	{
		this(80,90,101,"Nikhil");
		m1=95;
		m2=90;
		rollNo=100;
		name ="Rutuja";
	}
	Student2(int m1,int m2,int rollNo,String name)
	{
		this.m1=m1;
		this.m2=m2;
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public void showDetails()
	{
		System.out.println("Stuent marks1:"+m1);
		System.out.println("Student marks2:"+m2);
		System.out.println("Student rollNo:"+rollNo);
		System.out.println("Student Name:"+name);
		
	}

	public static void main(String[] args)
	{
		Student2 s=new Student2();
		s.showDetails();
		
		
		Student2 s1=new Student2();
		s1.showDetails();
				

	}

}
