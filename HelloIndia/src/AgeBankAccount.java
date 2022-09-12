import java.util.Scanner;

public class AgeBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("allow the person bank account open");
			
		}
		else 
			
			{
				System.out.println("not allow the person in bank account open");
			}
		sc.close();

	}

}
