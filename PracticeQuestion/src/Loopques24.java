import java.util.Scanner;

public class Loopques24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a program to print 1,4,9,16,....n//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n= sc.nextInt();
		for(int i=1;i<n;i++)
		{
			int series=i*i;
			System.out.println(series);
		}

	}

}
