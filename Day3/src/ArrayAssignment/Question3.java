package ArrayAssignment;
	//WAP to print the array in reverce order E.g arr[]=[3,90,45,29,37,78]so your output must be 78,37,29,45,90,3//

public class Question3
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
