package AssignmentArray;

public class SecLargestArray {

	public static void main(String[] args) {
		int arr[]= {21,3,5,65,879,23,43};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]< arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Second largest number:"+arr[1]);

	}

}
