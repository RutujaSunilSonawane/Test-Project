
public class ReverseArrayQuestion
{

	public static void main(String[] args)
	{
		int arr[]=new int[] {12,34,56,78,90};
		System.out.println("Orignal Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Array in Reverse order");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
