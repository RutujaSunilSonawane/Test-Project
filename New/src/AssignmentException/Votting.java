package AssignmentException;

import java.util.Scanner;

class YungerAge extends RuntimeException
{
	YungerAge(String msg)
	{
		super(msg);
	}
}
public class Votting {

	public static void main(String[] args) throws YungerAge
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
	
		
		if(age<18)
		{
			throw new YungerAge("Not Eligible Vote");
		}else
		{
			System.out.println("Eligible");
			
		}
	
	
		
		

	}

}
