package Interface;

abstract public class Parent
{
	String veg;
	String veg1;
	Parent(String s,String n)
	{
		veg=s;
		veg1=n;
		System.out.println("The vegetable are "+s+"  "+n);	
	}
	abstract void cook();
	void wash()
	{
		System.out.println("wash the car");
	}
}
class Child extends Parent
{
	Child()
	{
		super("Greenvegetable","carrent");
	}
	public void cook()
	{
		System.out.println("They are cooking the vegetables");
	}
}
