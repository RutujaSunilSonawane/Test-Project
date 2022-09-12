

class Parent
{
	public void display()
	{
		System.out.println("This is the parent class");
	}
}
class  Child extends Parent
{
	public void view()
	{
		System.out.println("this is the child class");
	}
}
public class Question4
{
	public static void main(String []arfs)
	{
		Parent p=new Parent();
		p.display();
		Child c=new Child();
		c.view();
		p=new Child();
		
	}

}
