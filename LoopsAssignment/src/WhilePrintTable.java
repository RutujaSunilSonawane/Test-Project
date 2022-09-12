import java.util.Scanner;

public class WhilePrintTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print the table in given number//
		Scanner sc=new Scanner(System.in);
		int i = 0;
		System.out.println("enter number");
		int number=sc.nextInt();
		while(i<=10)
		{
			System.out.println(number*i);
			i++;
		}

	}

}
