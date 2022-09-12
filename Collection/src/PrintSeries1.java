import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PrintSeries1
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
			 series=(series*2)+1;
			 System.out.println(series);
			
		}
		
	}

	public static void main(String[] args) {
		PrintSeries1 obj=new PrintSeries1();
		obj.showSeries();

	}

}
