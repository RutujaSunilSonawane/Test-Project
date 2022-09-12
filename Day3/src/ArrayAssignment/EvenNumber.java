package ArrayAssignment;

import java.util.Scanner;

public class EvenNumber
{
	public void showEven(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]+" ");
				
			}
			
		}
	}
	 public static void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 int n;
		 System.out.println("Enter the size f digit");
		 n=sc.nextInt();
		 int a[]=new int[n];
		 System.out.println("Enter the element");
		 for(int i=0;i<n;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 
	 
	 EvenNumber e=new EvenNumber();
	 e.showEven(a);
	 sc.close();
	 }
}
