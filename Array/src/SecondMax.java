
public class SecondMax {
	public static int secondMax(int arr[],int total)
	{
		int temp;
		for(int i=0;i<total;i++)
		{
			for(int j=i-1;j<total;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[total-2];
		
	}

	public static void main(String[] args) {
		int arr[]= {20,0,77,56,3,2,5};
		int b[]= {2,3,5,6};
		System.out.println("Second maximum number"+secondMax(arr, 7));
		System.out.println("Second maximum number"+secondMax(b, 4));
		

	}

}
