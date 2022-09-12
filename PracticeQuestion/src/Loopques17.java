import java.util.Scanner;

public class Loopques17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to check the given number is palindrome or not//
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int n=sc.nextInt();
		num=n;
		{
			int digit,sum=0;
			while(n!=0)
			{
				digit=n%10;
				sum=sum*10+digit;
				n/=10;
			}
			if(num==sum)
			{
				System.out.println("Number is Palindrome:"+num);
			}
			else
			{
				System.out.println("Number is not Palindrome:"+num);
			}
		}
		sc.close();

	}

}
