package ArrayAssignment;

import java.util.Scanner;

public class MissingNumber10 {


		public void miss(int[]a)
		{
			System.out.print("The missing number is:");
			for(int i=1;i<a.length;i++)
			{
				if(a[i-1]+1!=a[i])
					System.out.print(a[i-1]+1+" ");
			}
		}
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the size of Array");
			int n=sc.nextInt();
			System.out.print("Enter the element of array");
			int[]a=new int[n];
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			MissingNumber10 mn=new MissingNumber10();
			mn.miss(a);
			sc.close();
			
			

	}

}
