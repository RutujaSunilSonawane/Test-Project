import java.util.Scanner;

public class Binary
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		Integer i=new Integer(num);
		System.out.println(Integer.toBinaryString(num));
	}

}
