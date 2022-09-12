package ArrayAssignment;
//Write a java program to find dublicate values of an array of integer values. Means e.g. arr1[]=[3,10,90,78,56,10,78,34,61],so duplicates are 10,78//
public class DublicateArray6
	{
		public void dublicate(int[]a)
		{
			System.out.print("Dublicate Elements of given Array are::");
			for(int i=0;i<a.length;i++)
			{
				for(int j=i;j<a.length;j++)
				{
					if(a[i]==a[j])
						System.out.print(a[j]+"");
				}
			}
		}

	public static void main(String[] args)
	{
		int []a= {3,10,90,78,34,56,10,61,78};
		DublicateArray6 od=new DublicateArray6();
		od.dublicate(a);

	}

}
