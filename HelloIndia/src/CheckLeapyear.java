import java.util.Scanner;

public class CheckLeapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a java program to check whether a year is leap year or not.//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any year:");
		int year=sc.nextInt();
		
		
		
		
		if(year %400==0)
		{
			System.out.println("year"+year+"is a leap year");
		}
		else
		{
			System.out.println("year is not leap");
		}
		sc.close();

	}

}
