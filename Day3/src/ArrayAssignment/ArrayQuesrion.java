package ArrayAssignment;

public class ArrayQuesrion
{
	static void min(int arr[])
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println(min);
	}
	

	public static void main(String[] args)
	{
		int arr[]= {23,4,5,6,1};
		min(arr);
		

	}

}
