package ArrayAssignment;

public class SecondMax1 
{
	void maxSecond(int[]a)
	{
		System.out.print("Second Maximum number is ");
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max) 
			{
				max=a[i];
			}
		}
		int secondMax=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>secondMax && a[i]!=max)
			{
				secondMax=a[i];
				
			}
		}
		System.out.print(secondMax);
	}

	public static void main(String[] args)
	{
			int A[]= {20,0,31,45,100,1,105,90};
			SecondMax1 se=new SecondMax1();
			se.maxSecond(A);
			
	

	}

}
