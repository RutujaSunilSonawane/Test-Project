import java.util.Scanner;

public class Forloopfactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Factorial number//
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int i=1;
		long fact=1;
		int num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
			System.out.println("Factorial no:"+num+"is:"+fact);
	}

}
