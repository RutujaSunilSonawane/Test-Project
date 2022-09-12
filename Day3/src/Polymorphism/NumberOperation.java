package Polymorphism;

public class NumberOperation
{
	public void addNumbers(int x,int y,float z)
	{
		System.out.println("Addition Of Number is:"+(x+y+z));
	}
	public int addNumbers(int x, int y)
	
	{
		return x+y;
	}
	private void addNumbers(int y,float z)
	{
		System.out.println("Addition of Number is:"+(y+z));
	}

		public static void main(String[]args)
		{
			NumberOperation n=new NumberOperation();
			n.addNumbers(45, 50.00f);
			n.addNumbers(4, 6, 30.00f);
			System.out.println("Addition with(int,int):"+n.addNumbers(34, 56));
			
		}
		
}