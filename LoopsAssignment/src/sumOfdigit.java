import java.util.Scanner;

public class sumOfdigit {
	public int digitSum(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sumOfdigit s=new sumOfdigit();
		System.out.println("sum of digit is:"+s.digitSum(num));

	}
		
}
