import java.util.Scanner;

public class AssignmentQues2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			int i,sum;
			System.out.println("Enter the any three number");

			i=sc.nextInt();
			for(sum=0;i!=0;i=i/10);
			{
				sum=sum+i%10;
			}
		
		System.out.println(+sum);
		}
		

	}

}
