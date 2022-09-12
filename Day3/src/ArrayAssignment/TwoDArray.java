package ArrayAssignment;

import java.lang.reflect.Array;
import java.util.Scanner;

public class TwoDArray
{
	public void showArray(int a[][])
	{
		//for(int i=0;i<a.length;i++)
		//{
		//	for(int j=0;j<a[i].length;j++)
		//	{
		//		System.out.print(a[i][j]+" ");
			//}
			//System.out.println();
		//}
		for(int arr[]:a)
		{
			//System.out.println(Array.toString(arr));
			for(int x:arr)
			{
				System.out.print(x+" ");
			
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		TwoDArray o = new TwoDArray();
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
		o.showArray(a);
		
	}

}
