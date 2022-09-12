import java.util.Scanner;

public class Loopques22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a program to print 1,3,7,15,31,...n//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n,i,pr=0;
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			pr=(pr*2)+1;
			System.out.print(" "+pr);
		}
				
		sc.close();
	}

}
