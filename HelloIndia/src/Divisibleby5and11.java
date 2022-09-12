import java.util.Scanner;

public class Divisibleby5and11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//write a java program to check whether a number is divisible by 5 and11 or not//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to check wheather it is divisible by 5 and 11:");
		int number=sc.nextInt();
		
		if((number % 5==0) &&(number %11==0))
		{
			System.out.println("divisible by 5 and 11:");
		}
		else
		{
			System.out.println("not divisible by 5 and 11:");
		}
		sc.close();
			
	}

}
