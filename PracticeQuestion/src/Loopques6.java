import java.util.Scanner;

public class Loopques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a program to sum of all even number between 1 to n//
		Scanner sc=new Scanner(System.in);
		int i,sum=0;
		System.out.println("Enter any number");
		int n=sc.nextInt();
		
		for(i=2;i<=n;i+=2)
		{
			sum+=i;
			
		}
		System.out.println(sum);
		

		
	}

}
