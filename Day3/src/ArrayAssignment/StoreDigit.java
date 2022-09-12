package ArrayAssignment;

import java.util.Scanner;

public class StoreDigit {
 

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the digit");
		
		int num=sc.nextInt();
		String string_number=Integer.toString(num);
		for(int i=0;i<string_number.length();i++)
		{
			
			System.out.print(string_number.charAt(i)+",");
		}
	

	}

}
