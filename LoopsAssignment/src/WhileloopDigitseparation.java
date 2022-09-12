import java.util.Scanner;

public class WhileloopDigitseparation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//digit separation for any number//
		Scanner sc=new Scanner(System.in);
		int num=0;
		System.out.println("Enter no");
		int no=sc.nextInt();
		while(no>0)
		{
			int i;
			i=no%10;
			System.out.println(i);
			no=no/10;
		}
		

	}

}
