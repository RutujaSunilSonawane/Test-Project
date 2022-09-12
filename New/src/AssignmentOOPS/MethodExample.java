package AssignmentOOPS;

public class MethodExample
{
	String color;
	int age;
	public void show(String c,int a)
	{
		color=c;
		age=a;
	}
	public void display()
	{
		System.out.println(color+"  "+age);
	}

	public static void main(String[] args) {
		MethodExample obj=new MethodExample();
		obj.show("Orange", 22);
		obj.display();

	}

}
