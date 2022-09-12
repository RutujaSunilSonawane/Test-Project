import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		//0 1 1 2 3 5 8 
		int n=20,firstTerm=0,secondTerm=1;
		{
			System.out.println("fibbonacci seried till:"+n+"terms");
		}
		for(int i=1;i<=n;i++)
		{
			System.out.println(+firstTerm);
			int nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
		

	}

}
