package AssignmentOOPS;

public class MethodOverloading
{
	public void show(int a,int b)
	{
		System.out.println(a+b);
	}
	public void show(int a,String b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) 
	{
		MethodOverloading obj=new MethodOverloading();
		obj.show(12,12);
		obj.show(11,"Rutuja");
		

	}

}
