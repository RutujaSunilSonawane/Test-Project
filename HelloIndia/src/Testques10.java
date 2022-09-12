import java.util.Scanner;

public class Testques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		int temp=0;
		int num=sc.nextInt();
		int temp1=0;
		for(int i=2;i<=no-1;i++)
		{
			if(no%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("The given number is prime number:"+no);
		}
		else
		{
			System.out.println("The given number is not prime number:");
		}
		for(int j=2;j<=num/2;j++)
		{
			if(num%j==0)
			{
				temp1=temp1+1;
			}
		}
		if(temp1==0)
		{
			System.out.println("The given number is prime number"+no);
			
		}
		else
		{
			System.out.println("The given number is not prime number");
			
		}
		if(num-no==2 || no-num==2)
		{
			System.out.println("The given number is twin prime no"+no+"and"+num);
		}
	
	
	}

}
