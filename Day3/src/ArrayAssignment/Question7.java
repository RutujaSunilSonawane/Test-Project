package ArrayAssignment;

public class Question7
{
	//Write a java program to find  the common elements between two array (int valve)Means e.g. arr1[]=[12,23,34,67,78,91,56],and arr2[]=[39,25,15,23,55,91,66,22],so common between two array are 23 and 91//
	public void commonElement(int a[],int b[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==(b[j]))
				{
					System.out.println("Common Element is : "+(a[i]));
				}
			}
		}
	}

	public static void main(String[] args)
	{
		
		int a[]= {12,23,34,67,78,91,56};
		int b[]= {39,25,15,23,55,91,66,22};
		
		Question7 obj=new Question7();
		obj.commonElement(a, b);
				
		
	}

}
