import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		
		if(num % 8 ==0)
			System.out.println("divisible by 8:"+num);
		else
			System.out.println("not divisible by 8:"+num);
		sc.close();
			

	}

}
