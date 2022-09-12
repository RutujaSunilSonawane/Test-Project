import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a java program to create Simple calculator using switch case.//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter your option");
		int option=sc.nextInt();
		
		switch(option)
		{
		case 1:
		{
			System.out.println("Addition="+a+b);
			break;
			
		}
		case 2:
		
		{
			System.out.println(+a-b);
			break;
		}
		case 3:
		{
			System.out.println("Multiplication="+a*b);
			break;
		}
		case 4:
		{
			System.out.println("Division="+a/b);
			break;
		}
		}
		

	}

}
