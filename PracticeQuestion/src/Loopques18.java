import java.util.Scanner;

public class Loopques18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to check given number is automorphicor not input n=25 output automorphicas 25*25=625//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int i=0,sqr=num*num;
		int temp=num;
		while(temp>0)
		{
			i++;
			temp=temp/10;
		}
		int lastSquareDigit=(int)(sqr%(Math.pow(10, i)));
		if(num==lastSquareDigit)
			System.out.println("Automorphic number");
			else
			{
				System.out.println("Not an Automorphic number");
			}
		sc.close();
				
		
		

	}

}
