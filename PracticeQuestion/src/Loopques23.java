import java.util.Scanner;

public class Loopques23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a program to print 1,2,4,7,11....n//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int series=((1+(i*(i+1))/2));
			System.out.print(" "+series);
			
				
			
		}
		

	}

}
