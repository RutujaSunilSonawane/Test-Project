import java.util.Scanner;

public class Ifelseevennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given number is even or odd//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is odd");
		}
	

	}

}
