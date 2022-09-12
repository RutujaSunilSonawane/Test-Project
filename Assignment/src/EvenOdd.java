import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a java program to check whether number is even or odd using switchcase.//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
			switch(num%2)
		
		{
			
			case 0:
			{
				System.out.println(" number is even"+num);
				break;
			}
			case 1:
			{
				System.out.println("number is odd"+num);
				break;
			}
			
		}
		sc.close();

	}

}
