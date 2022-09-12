package ArrayAssignment;

import java.util.Scanner;

public class MaxArrayQuestion
{
	static void max(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println(max);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	
		int arr[]= {12,34,55,67,90};
		max(arr);
	

	}

}
