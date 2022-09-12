import java.util.Scanner;

public class PrintInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a java program to enter the number between 1 to 5 and print in the word//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		
		int word=sc.nextInt();
		switch(word)
		{
		case 1:
		{
			System.out.println("Sangamner");
			break;
		}
		case 2:
		{
			System.out.println("Pune");
			break;
		}
		case 3:
		{
			System.out.println("Mumbai");
			break;
			
		}
		case 4:
		{
			System.out.println("Nashik");
			break;
		}
		case 5:
		{
			System.out.println("Nagpur");
			break;
		}
		
		}
		
		
		

	}

}
