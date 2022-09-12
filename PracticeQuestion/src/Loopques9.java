import java.util.Scanner;

public class Loopques9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a program to calculate product of digit of any number//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any digit");
		int i=sc.nextInt();
		int product=1;
		while(i>0)
		
		{
			int digit=i%10;
			product*=digit;
			i/=10;
		}
		System.out.println("Product of digitis:"+product);
		sc.close();
	}

}
