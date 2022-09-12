import java.util.Scanner;

public class Loopques15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1!+2!+3!.......+n!find s//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter last number");
		int sum = 0;
		int fact=1;
		int n=sc.nextInt();

		for(int i=1;i<=n;i++);
		{
			
			for(int j=1;j<=n;j++)
			{
				fact=fact*j;
			}
			sum=sum+fact;
			fact=1;
				
			System.out.println(sum);
		}
		sc.close();

	}

}
