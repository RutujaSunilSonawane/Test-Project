import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a java program to check whether a number is even or odd//
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		if(number%2==0)
		{
			System.out.println("Number is even:"+number);
		}
		else
		{
			System.out.println("Number is odd:"+number);
		}
		sc.close();

	}

}
