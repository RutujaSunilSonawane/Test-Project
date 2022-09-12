import java.util.Scanner;

public class DaysConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter Days:");
		int days= sc.nextInt();
		int years=(days/365);
		int weeks=(days-(years*365))/7;
		days=(days-(years*365)+(weeks*7));
		System.out.println("Years=" +years);
		System.out.println("Weeks="+weeks);
		System.out.println("days="+days);
		sc.close();

	}

}
