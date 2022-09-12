import java.util.Scanner;

public class Forloopproductdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a program to product of any digit//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit");
		int i =sc.nextInt();
		int product;
		for(product=1;i>0;i++)
		{
			int digit=i%10;
			product*=digit;
			i/=10;
		}
		System.out.println(+product);
		sc.close();

	}

}
