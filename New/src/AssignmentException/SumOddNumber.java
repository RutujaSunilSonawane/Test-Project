package AssignmentException;

import java.util.Scanner;

public class SumOddNumber extends RuntimeException
{
	SumOddNumber(String number) 
	
	{
		super(number);
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			throw new SumOddNumber("Number is sum");
		}
		else
		{
			System.out.println("Number is odd");
		}

	}

}
