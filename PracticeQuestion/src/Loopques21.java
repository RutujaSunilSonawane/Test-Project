import java.util.Scanner;

public class Loopques21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a program to print 1,22,333,4444,55555 series//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range of limit");
		int n=sc.nextInt();
		int out,in;
		for(out=1;out<=n;out++)
		{
			for(in=1;in<=out;in++)
			{
				System.out.print(out);
				
			}
			System.out.print("");
		}
		sc.close();

	}

}
