package ArrayAssignment;

import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		int n,x,flag=1,loc=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of element you want in array");
		 n=sc.nextInt();
		 int a[]=new int [n];
		 System.out.println("Enter all elements");
		 for(int i=0;i<n;i++)
		 {
			 a[i]=sc.nextInt();
			 
		 }
		 System.out.print("Enter the element you want to delete");
		 x=sc.nextInt();
		 for(int i=0;i<n;i++)
		 {
			 if(a[i]==x)
			 {
				 flag=1;
				 loc=i;
				 break;
			 }
			 else
			 {
				 flag=0;
			 }
		 }
		 if(flag==1)
		 {
			 for(int i=loc+1;i<n;i++)
			 {
				 a[i-1]=a[i];
				 
			 }
			System.out.print("After Delecting");
			for(int i=0;i<n-2;i++)
			{
				 System.out.print(a[i]+",");
			}
			 System.out.print(a[n-2]);	
		 }
		

	
	else
	{
		System.out.println("Element not found");
	}
	}
}

	

