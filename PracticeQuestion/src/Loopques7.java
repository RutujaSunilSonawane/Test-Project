import java.util.Scanner;

public class Loopques7 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				//write a program to find sum of all odd number between 1 to n//
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter any number");
			int i,sum=0;
			int n=sc.nextInt();
			for(i=1;i<=n;i++)
			{
				if((i%2)==1)
				{
					sum+=i;
				}
			}
			System.out.println(sum);
			sc.close();
		}
	}

}
