package AssignmentException;

import java.util.Scanner;

public class Example  extends RuntimeException
{
	Example(String name)
	{
		super(name);
	}

	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the name");
	    String name=sc.nextLine();
	    if(name.length()<8)
	    {
	    	throw new Example("Valid");
	    }
	    else
	    {
	    	System.out.println("not valid");	    }
	
	}
}
