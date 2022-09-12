import java.util.Scanner;

public class PosNegZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a java program to check number is negative,positive or zero//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		if(number>0)
		{
			System.out.println("Number is Positive:"+number);
		}
		else if(number<0)
		{
			System.out.println("Number is Negative:"+number);
		}
		else
		{
			System.out.println("Number is zero");
		}
		sc.close();

	}

}
