
public class ArthmaticExceptionalkeyword {

	public static void main(String[] args) {
		try
		{
			int a=4/2;
			System.out.println("Division of :"+a);
		}
		catch(ArithmeticException a)
		{
			System.out.println(a);
			System.out.println(	a.getClass());
			System.out.println(a.getMessage());
			System.out.println("Task completed");
		}

	}

}

	  
