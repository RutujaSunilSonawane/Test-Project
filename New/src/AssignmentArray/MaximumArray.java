package AssignmentArray;

public class MaximumArray {

	public static void main(String[] args) {
	int arr[]= {3,54,7,32,1,56,75};
	int max=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	System.out.println(max);

	}

}
