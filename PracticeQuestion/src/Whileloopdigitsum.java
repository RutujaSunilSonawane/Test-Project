import java.util.Scanner;

public class Whileloopdigitsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//digit sum//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digits");
		int i ,sum = 0;
		i=sc.nextInt();
		while(i!=0)
		{
			sum=sum+i%10;
		}
		System.out.println("sum digit number:"+sum);
				i=i/10;

	}

}
