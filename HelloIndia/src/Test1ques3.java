import java.util.Scanner;

public class Test1ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int temp=sc.nextInt();
		int rev=0,sum=0,add=0;
		for(;temp!=0;temp=temp/10)
		{
			int r=temp%10;
			rev=(rev*10)+r;
			
		}
		for(int i=1;rev!=0;rev=rev/10,i++)
		{
			int num=1;
			int r=rev%10;
			sum=sum+r;
			
			for(int j=i;j>=1;j--)
			{
				num=num*r;
			}
			System.out.println(r+"   "+i+"   "+num);
			add=add+num;
		}
		System.out.println("Total="+add);
		sc.close();
		
	}

}
