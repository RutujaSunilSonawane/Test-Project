package ArrayAssignment;

import java.util.Scanner;

public class TwoDArrayEvenNumber
{
	public void showEven(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]%2==0)
					System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of row and col");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		System.out.print("Enter Array element");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		TwoDArrayEvenNumber e=new TwoDArrayEvenNumber();
		e.showEven(a);
		sc.close();
	}

}
