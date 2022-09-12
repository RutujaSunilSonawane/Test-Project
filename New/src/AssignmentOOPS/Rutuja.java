package AssignmentOOPS;
interface Example
{
	void show();
}
interface Sakshi
{
	void display();
}
public class Rutuja implements Example,Sakshi
{
	public void show()
	{
		System.out.print("Hello");
	}
	public void display()
	{
		System.out.println("   Nikhil");
	}
	public static void main(String[] args)
	{
		Rutuja n=new Rutuja();
		n.show();
		n.display();
	

	}

}
