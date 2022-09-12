package ArrayAssignment;
//WAP to swap array like input array is[2,4,9,0],so your output array must be[9,0,2,4]//


public class SwapArray8 
{
	public void swap(int a[])
	{
		System.out.println("**swap array [2,4,9,0],so your output array must be [9,0,2,4]**");
		System.out.print("After Swaping og given Array are::");
		int temp=a[0];
		a[0]=a[2];
		a[2]=temp;
		temp=a[1];
		a[1]=a[3];
		a[3]=temp;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"");
		}
	}

	public static void main(String[] args)
	
	{
		int a[]= {2,4,9,0};
		SwapArray8 od= new SwapArray8();
		od.swap(a);
		

	}

}
