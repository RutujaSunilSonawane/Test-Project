package AssignmentArray;

public class MinimumArray {

	public static void main(String[] args) {
		int arr[]= {21,435,6,321,43,666,5};
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);

	}

}
