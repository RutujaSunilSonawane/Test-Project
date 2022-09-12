package Polymorphism;


	public class AreaOverLoaded
	{
		


		public double calculateArea(float r)
		{
			return 3.14*r*r;
		}
		public int calculateArea(int l,int b)
		{
			return l*b;
		}
		public double calculateArea(float b,int h)
		{
			return 0.5*b*h;
		}
		
		public static void main(String[] args)
		{
			AreaOverLoaded a1=new AreaOverLoaded();
			System.out.println("Area of Circle:"+a1.calculateArea(3.4f));
			System.out.println("Area of Rectangular:"+a1.calculateArea(4,3));
			System.out.println("Area of triangle:"+a1.calculateArea(3.4f,5));
		}
	}


