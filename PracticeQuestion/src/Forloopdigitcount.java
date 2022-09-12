import java.util.Scanner;

public class Forloopdigitcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a program to count number in any digit//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter digit");
		int num=sc.nextInt();
		int count;
		for(count=0;num!=0;count++)
		{
			num/=10;
		}
		System.out.println(+count);
		

	}

}
