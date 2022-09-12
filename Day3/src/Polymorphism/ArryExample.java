package Polymorphism;

import java.util.Scanner;

public class ArryExample {

	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Arry:");
		int []a=new int [5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("Arry element are:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		sc.close();

	}

}
