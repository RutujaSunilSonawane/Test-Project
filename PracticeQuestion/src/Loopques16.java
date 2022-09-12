import java.util.Scanner;

public class Loopques16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to check given number Krishnamurthy or not eg)153=1!+5!+3!=153
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check:");
		int num ,den,fact,sum=0;
		int n=sc.nextInt();
		num=n;
		for(; num>0;num=num/10)
		{
			den=num%10;
			fact=den*den*den;
			sum=sum+fact;
			
		}
		if(sum==n)
			{
			System.out.println("Krishnamurthy number");
			}
			else
			{
			System.out.println("not Krishnamurthy");
			}
			sc.close();
		

	}

}
