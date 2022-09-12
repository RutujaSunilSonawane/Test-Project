import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find all prime number between 1 to 50.//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		int temp=0;
		int count=0;
		
		for(int i=2;i<=50;i++)
		{
			if(50%i==0)
				count++;
			
		}
			if(count==0)
				System.out.println("prime");
			else
				System.out.println("not prime");
	}

}
