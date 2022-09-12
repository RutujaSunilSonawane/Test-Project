package ArrayAssignment;



public class SumOfArray 
{
	int a[]= {5,6,3,5,6,1,3};
	public int getSum(int a[])
	{
		
		int total=0;
		for(int ele:a)
		{
			total+=ele;
		}
		return total;
	}

	public static void main(String[] args) {
		SumOfArray s=new SumOfArray();
	

	}

}
