import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to print Fibonacci series up to 20 terms.//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=0,b=1,c;
		int term=sc.nextInt();
		for(int i=1;i<=20;i++)
		{
			System.out.println(a+"");
			c=a+b;
			a=b;
			b=c;
		}
		sc.close();

	}

}
