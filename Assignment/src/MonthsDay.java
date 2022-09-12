import java.util.Scanner;

public class MonthsDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//. Write a Java program print total number of days in a month//
		Scanner sc=new Scanner(System.in);
		int daysinMonths=0;
		String MonthName="Invalid";
		System.out.println("Enter the month number");
		int month=sc.nextInt();
		
		
			switch(month)
			{
			case 1:
			{
				System.out.println("jan");
				System.out.println(daysinMonths=31);
				break;
			}
			case 2:
			{
				System.out.println("feb");
				System.out.println(daysinMonths=28);
				break;
			}
			case 3:
			{
				System.out.println("mar");
				System.out.println(daysinMonths=31);
				break;
			}
			case 4:
			{
				System.out.println("april");
				System.out.println(daysinMonths=30);
				break;
			}
			case 5:
			{
				System.out.println("May");
				System.out.println(daysinMonths=31);
				break;
			}
			case 6:
			{
				System.out.println("June");
				System.out.println(daysinMonths=30);
				break;
			}
			case 7:
			{
				System.out.println("july");
				System.out.println(daysinMonths=31);
				break;
			}
			case 8:
			{
				System.out.println("august");
				System.out.println(daysinMonths=31);
				break;
			}
			case 9:
			{
				System.out.println("sept");
				System.out.println(daysinMonths=30);
				break;
			}
			case 10:
			{
				System.out.println("Oct");
				System.out.println(daysinMonths=31);
				break;
			}
			case 11:
			{
				System.out.println("Nov");
				System.out.println(daysinMonths=30);
				break;
			}
			case 12:
			{
				System.out.println("Dec");
				System.out.println(daysinMonths=31);
				break;
			}
		}
		
		
	}

}
