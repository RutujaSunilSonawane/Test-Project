package AssignmentException;

import java.util.Scanner;

class UnderAgeException extends Exception
{
	UnderAgeException()
	{
		super("You are under age");
	}
	UnderAgeException(String msg)
	{
		super(msg);
	}
}
public class CustomizedException {

	public static void main(String[] args) throws UnderAgeException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		//try
		//{
		if(age<18)
		{
			throw new UnderAgeException();
		}
		else
		{
			System.out.println("not Valid");
		}
		//}
		//catch(UnderAgeException e)
		//{
		//	System.out.println(e);
		//}
		
		

	}

}
