import java.util.Scanner;

public class TribonacciSeries {

	public static void main(String[] args) {
	//0 1 2  3  6 11 last three number
		int a=0,b=1,c=2,d,term;
		System.out.println("enter term");
		Scanner sc=new Scanner(System.in);
		term=sc.nextInt();
		for(int i=1;i<=term;i++)
		{
			System.out.print(a);
			d=a+b+c;
			a=b;
			b=c;
			c=d;
			System.out.println();
			
		}
		
		
		
		

	}

}
