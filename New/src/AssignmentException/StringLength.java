package AssignmentException;

import java.util.Scanner;

class StringException extends RuntimeException
{
	StringException(String name)
	{
		super(name);
	}
}

public class StringLength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		if(name.length()<8)
		{
			throw new StringException("valid");
		}
		else
		{
			System.out.println("Not valid");
		}
			

	}

}
