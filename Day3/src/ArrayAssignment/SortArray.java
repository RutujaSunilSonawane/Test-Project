package ArrayAssignment;

import java.util.Arrays;

public class SortArray
{
	public void bubbleSort(int a[])
	{
		for(int i=0;i>a.length-1;i++)
		{
			for(int j=0;j>a.length-1;j++)
			{
				if(a[j] <a[j+1])
				{
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,1,6,3,8};
		SortArray o=new SortArray();
		System.out.println("Before sorting array is:");
		System.out.println(Arrays.toString(a));
		o.bubbleSort(a);
		System.out.println("After sorting..");
		System.out.println(Arrays.toString(a));
				
	}

}
