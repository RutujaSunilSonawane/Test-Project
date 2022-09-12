package ArrayAssignment;
//WAP  to reverse the array itself ,don't print array in reverse -I want current array reverce. Means e.g. arr[]=[3,90,,45,29,37,78] so your same array must be [78,37,29,45,90,3]without using temporary array.//

public class ReverseArray5
	{
		public void arrayReverseOrder(int a[])
		{
			System.out.println("Array in reverse order:");
	
			for(int i=a.length-1;i>=0;i--)
			{
				System.out.println(a[i] + " ,");
			}
		}

		public static void main(String[] args)
		{
			int a[] = {3,90,45,29,37,78};
			Question3 obj=new Question3();
			obj.arrayReverseOrder(a);

		}



}
