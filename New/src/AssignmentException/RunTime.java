package AssignmentException;

public class RunTime {

	public static void main(String[] args) {
		try
		{
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
		
		}
		catch(Exception e)//catch(ArithmeticException e)
		{
			System.out.println("Exception:"+e);
		}
		finally
		{
			System.out.println("I am finally block");
		}

	}

}
