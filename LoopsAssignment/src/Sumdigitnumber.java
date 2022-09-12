import java.util.Scanner;

public class Sumdigitnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sum of digit number//
		Scanner sc=new Scanner(System.in);
		int i,sum;
		System.out.println("Enter number");
		i=sc.nextInt();
		for(sum=0;i!=0;i=i/10)
		{
			sum=sum+i%10;
		}
		System.out.println("sum of digits:" +sum);

	}

}
