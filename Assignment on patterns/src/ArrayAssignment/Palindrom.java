package ArrayAssignment;

import java.util.Scanner;

public class Palindrom
{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		int r,sum=0,temp;
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("Given Number is Palindrom");
		}
		else
		{
			System.out.println("Given number is not palindrom");
		}
		
		


	}

}
