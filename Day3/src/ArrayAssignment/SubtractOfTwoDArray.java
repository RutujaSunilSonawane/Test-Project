package ArrayAssignment;

import java.util.Scanner;

public class SubtractOfTwoDArray 
{
	public void showArray(int[][]a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=a[i][j]-a[i][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}

	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows and col:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		
		System.out.print("Enter Array Elenent");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			
			}
		}
		SubtractOfTwoDArray  s=new SubtractOfTwoDArray();
		s.showArray(a);
		sc.close();
		
		

	}

}
