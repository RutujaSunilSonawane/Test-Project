import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print the 1 to 5 number using switch case//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int number=sc.nextInt();
		switch(number)
		{
		case 9 :
		{
			System.out.println("1");
			break;
			
		}
		case 10:
		{
			System.out.println("2");
			break;
		}
		case 11:
		{
			System.out.println("3");
			break;
		}
		case 12:
		{
			System.out.println("4");
			break;
		}
		case 13:
		{
			System.out.println("5");
			break;
		}
		default:
		{
			System.out.println("Any number");
			break;
		}
		}

	}

}
