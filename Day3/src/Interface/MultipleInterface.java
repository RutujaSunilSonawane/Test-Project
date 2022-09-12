package Interface;

public class MultipleInterface
{

	public static void main(String[] args)
	{
		Shop s=new Shop();System.out.println("The Addition is:"+s.add(10,20));
		s.mul(2, 3);
		s.div(10, 2);
		s.sub(25, 5);
		s.bill(200, 200);
		

	}

}
