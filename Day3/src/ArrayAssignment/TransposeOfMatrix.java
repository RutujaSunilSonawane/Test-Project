package ArrayAssignment;

import java.util.Scanner;

public class TransposeOfMatrix {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of row and col");
	int row=sc.nextInt();
	int col=sc.nextInt();
	int transpose[][] =null;
	int original[][] = null;

	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			transpose[i][j]=original[i][j];
		}
	}
	System.out.println("Printing matrix without transpose");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			System.out.print(original[i][j]+"");
		}
		System.out.println();

	}	
	System.out.println("Printing matrix After transpose");
	
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			System.out.print(transpose[i][j]+"");
		}
		System.out.println();

	}	

	}

}
