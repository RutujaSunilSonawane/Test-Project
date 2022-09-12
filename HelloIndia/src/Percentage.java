import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the percentage");
		int percentage=sc.nextInt();
		if(percentage>=75)
		{
			System.out.println("Distinction");
		}
		else if(percentage>=60)
		{
			System.out.println("First Class");
		}
		else if(percentage>=55)
		{
			System.out.println("higher second class");
			
		}
		else if(percentage>=35)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("bellow 35 fail");
		}
		sc.close();
		

	}

}
