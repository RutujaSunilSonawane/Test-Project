package AssignmentException;

import java.util.Scanner;

class StringLengthException extends Exception
{
	StringLengthException()
	{
		super();
	}
	StringLengthException(String name)
	{
		super(name);
	}
}
public class CostomizedString {

	public static void main(String[] args) throws StringLengthException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
	
		
		if(name.length()<4)
		{
			throw new StringLengthException("valid");
		}
		else
		{
			System.out.println("not valid");
		}
		

	}

}
