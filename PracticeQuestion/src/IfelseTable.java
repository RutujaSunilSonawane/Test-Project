import java.util.Scanner;

public class IfelseTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//table//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks");
		int num=sc.nextInt();
		int i=1;
		if(i<=10 )
		{
			i++;
			
			System.out.println(num*i);
		}
		sc.close();

	}

}
