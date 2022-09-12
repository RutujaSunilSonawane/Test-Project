import java.util.Scanner;

public class Ifelsepassfail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//student is pass or fail//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks");
		int m=sc.nextInt();
		if(m>0 && m<=100)
		{
			if(m>=40)
			{
				System.out.println("Student is pass!");
				
			}
			else
			{
				System.out.println("Student is Fail!");
			}
			
		}
		else
		{
			System.out.println("Student is invalid");
		}


	}

}
