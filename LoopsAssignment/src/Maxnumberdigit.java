import java.util.Scanner;

public class Maxnumberdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Maximum number of digit//
		int i;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the digit");
		int num=sc.nextInt();
		int max=num%10;
		while(num>0)
		{
			if(num%10>max)
			{
			 max=num%10;
			}
			num=num/10;
		}
		System.out.println(max);
		
	}

}
