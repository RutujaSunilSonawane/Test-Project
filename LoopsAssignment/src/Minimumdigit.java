import java.util.Scanner;

public class Minimumdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int min=num%10;
		while(num>0)
		{
			if(num%10<min)
			{
				min=num%10;
			}
			num=num/10;
		}
		System.out.println(min);
		

	}

}
