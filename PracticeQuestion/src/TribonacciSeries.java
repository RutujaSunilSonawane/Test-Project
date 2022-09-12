import java.util.Scanner;

public class TribonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c=1;
		System.out.println(a+""+b);
		int d;
		for(int i=4;i<=10;i++)
		{
			d=a+b+c;
			System.out.println(c);
			a=b;
			b=c;
			c=d;
		}
	
		

	}

}
