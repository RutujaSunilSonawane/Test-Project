import java.util.Scanner;

public class Primetwin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1");
		 int num1=sc.nextInt();
		 System.out.println("Enter num1");
		 int num2=sc.nextInt();
		
		 int flag;
		 
		 for(int i=num1;i<=num2;i++)
		 {
			if(i==1 ||i==0)
				continue;
			flag=1;
			
			 for(int j=2;j<=i/2;j++)
			 {
				 if(i%j==0)
				 {
					 flag=0;
					break;
				 }	
					 
				 if(flag==1)
					 System.out.println(num1+"and"+num2+"are twin prime");
				 
				 else
					 System.out.println(num1+"and"+num2+"are not twin prime");
				 
					 
			 }
			 
			
			
		 }
		
		
	}

	

}
