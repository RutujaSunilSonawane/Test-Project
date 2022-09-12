import java.util.ArrayList;
import java.util.Scanner;

public class PrintSeries2
{
	public void showSeries()
	{
		int series=0;
		ArrayList<Integer>num=new ArrayList<Integer>();
		System.out.println(num);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num1=sc.nextInt();
		
		
		for(int i=0;i<=num1;i++)
		{
			// series=series(num1)+series(num1-1);
			// System.out.println(series);
			
		}
	}


	


	public static void main(String[] args) {
		
		PrintSeries2 obj=new PrintSeries2();
		obj.showSeries();
	}

}
