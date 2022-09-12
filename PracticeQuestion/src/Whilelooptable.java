import java.util.Scanner;

public class Whilelooptable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//table//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int i=1;
		int num=sc.nextInt();
		while(i<=10)
		{
			System.out.println(num*i);
			i++;
		}

	}

}
