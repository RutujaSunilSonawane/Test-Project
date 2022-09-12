import java.util.Scanner;

public class Forlooptable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to print the table//
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int i=1;
		int num=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(num*i);
		}

	}

}
