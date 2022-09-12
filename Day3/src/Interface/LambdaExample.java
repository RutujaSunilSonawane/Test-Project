package Interface;


public class LambdaExample {

	public static void main(String[] args)
	{
		Service se=(String s)->
		{
			System.out.println("This is the Transport Service"+s);
		};
		se.traceportService("This is the Service");

	}

}
