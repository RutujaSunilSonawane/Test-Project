import java.util.Scanner;

public class Loopques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a program to count number of digit in any number//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any digit");
		int i=sc.nextInt();
		int count=0;
		while(i!=0)
		{
			i/=10;
			++count;
		}
		{
			
			System.out.println("number of digit count:"+count);
		}

	}

}
