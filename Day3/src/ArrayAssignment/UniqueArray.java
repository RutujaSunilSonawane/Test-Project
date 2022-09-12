package ArrayAssignment;

public class UniqueArray 
{
	public void elements(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==a[i])
				{
					count++;
					
				}
			}
			if(count==1)
			{
				System.out.print(a[i]+",");
			}
		}
	}
	public static void main(String[] args)
	{
		int a[]= {7,8,7,6,5,6,5,3};
		UniqueArray obj=new UniqueArray();
		obj.elements(a);

	}

}
