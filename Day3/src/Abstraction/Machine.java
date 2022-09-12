package Abstraction;

abstract public class Machine
{
	abstract void crush();
	abstract void filter();
	public void blead(String x)
	{
		System.out.println("Blead of mixer is:"+x);
	}
	
	public void rotate(String s)
	{
		System.out.println("Rotated Machine is:"+s);
	}

}
abstract class Mixer extends Machine
{
	public void crush()
	{
		System.out.println("Mixer is crush");
	}
	
}
class Juicer extends Machine
{
	public void crush()
	{
		System.out.println(" juicer crush");
		//rotated("Mango");
	}
	
	public void filter()
	{
		System.out.println(" juice is filter");
	}
}


   