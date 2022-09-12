import java.util.Scanner;

public class Loopques19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to find given number is Harshad/Niven number or not An harshad number is an integer number divisible by sum of its digit //
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int rem=0,sum=0,n;
		n=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(n%sum==0)
		{
			System.out.println("Harshad number is "+n);
			
		}
		else
		{
			System.out.println("Not Harshad number:"+n);
		}
		sc.close();
	}

}
