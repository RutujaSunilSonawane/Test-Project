import java.util.Scanner;

public class Loopques12 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				//WAP to print table any given number//
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter num");
			int i;
			int num=sc.nextInt();
			for(i=1;i<=10;i++)
			{
				System.out.println(num*i);
			}
			sc.close();
		}

	}

}
