
public class MethodCall
{
	 int logic(int x,int y)
	{
		int z;
		if(x>y)
		{
			z=x+y;
		}
		else
		{
			z=(x+y)*5;
		}
		return z;
	}

	public static void main(String[] args)
	{
		MethodCall obj=new MethodCall();
		System.out.println(obj.logic(2, 4));
		//obj.logic(2, 4);
		
		

	}

}
