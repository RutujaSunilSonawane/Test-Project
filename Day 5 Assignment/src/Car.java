
public final class Car
{
	String mod1="Maruti";
	static int totCarSold=400;
	
	
	static public void Ecar()
	{
		System.out.println(totCarSold);//
		//System.out.println(mod1);//Cannot make a static reference to the non-static field mod1
	}
	public void nonsta()
	{
		System.out.println(mod1);
	}

	public static void main(String[] args)
	{
	   Car.Ecar();
		Car c=new Car();
		c.nonsta();
	

	}
}
