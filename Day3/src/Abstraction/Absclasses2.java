package Abstraction;

abstract class Abs1
{
	abstract void doAbs1();
	
}
abstract class Abs2
{
	abstract void doAbs2();
}
class Temp extends Abs1
{
	public void doAbs1()
	{
		System.out.println("This is the Abstract class 1");
	}
}
/*class Temp extends Abs2
{
	public void doAbs2()
	{
		System.out.println("This is the Abstract class 2");
	}
}*/

public class Absclasses2 {

	public static void main(String[] args) {
		Abs1 a=new Temp();
		a.doAbs1();
		
		//Abs2 a1=new Temp();
		//a1.doAbs2();

	}

}
