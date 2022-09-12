 class Rectangular
{
	int length,breadth;
	
	public void  Rectangular(int l,int b)
	{
		length=l;
		breadth=b;
		System.out.println("Ractangular Area:"+(l*b));
		System.out.println("Rectangular area:"+(l+b)*2);
	}

}
class Square extends Rectangular
{
	int side;
	public void Square(int a)
	{
		super.Rectangular(12, 3);
		side=a;
		System.out.println("Square:"+a*a);
	}
}
public class Super
{
	public static void main(String[] args)
	{
		Square s=new Square();
		s.Square(12);
		System.out.println(s);
	}
}
