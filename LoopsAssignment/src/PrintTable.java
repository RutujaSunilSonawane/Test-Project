import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to take the number and user and print its table//
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter no");
		int no=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(no*i);
		}
		sc.close();

	}

}
