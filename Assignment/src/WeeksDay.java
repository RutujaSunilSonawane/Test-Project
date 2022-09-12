import java.util.Scanner;

public class WeeksDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a program that displays day of week //
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter tha day");
		int day=sc.nextInt();
		switch(day)
		{
		case 1:
		{
			System.out.println("Today is Monday");
			break;
		}
		case 2:
		{
			System.out.println("Today is Tuesday");
			break;
		}
		case 3:
		{
			System.out.println("Today is Wednesday");
			break;
		}
		case 4:
		{
			System.out.println("Today is thursday");
			break;
		}
		case 5:
		{
			System.out.println("Today is Friday");
			break;
		}
		case 6:
		{
			System.out.println("Today is Saturday");
			break;
		}
		case 7:
		{
			System.out.println("Today is Sunday");
			break;
		}
		default:
			System.out.println("day does not exits");
	
		
		}
		

	}

}
