import java.util.Scanner;

public class Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int number=sc.nextInt();
		for(int i=0;i<number;i++)
		{
			for(int j=number-i;j>1;j--)
			{
				System.out.print("");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
