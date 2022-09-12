package ArrayAssignment;

import java.util.Scanner;

public class TwoDArraySquare 
{
	public void showArray(int[][]a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=a[i][j]*a[i][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
	
		
		Scanner sc=new Scanner(System.in);
		int a[] [] ;
		System.out.println("How many rows and colums?");
		int row=sc.nextInt();
		int col=sc.nextInt();
	
		a= new int[ row][col];
		System.out.println("Enter Array element: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		TwoDArraySquare sq=new TwoDArraySquare();
		sq.showArray(a);
		sc.close();

	}

}
