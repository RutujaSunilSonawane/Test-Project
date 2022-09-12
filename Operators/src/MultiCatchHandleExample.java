import java.util.Scanner;
import java.util.InputMismatchException;

public class MultiCatchHandleExample {

	public static void main(String[] args)
	{
		int arr[];
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Size");
			int size=sc.nextInt();
			arr=new int[size];
			int sum=0;
			System.out.println("Enter the array Element:");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
				sum=sum+arr[i];
			}
			System.out.println("Sum of array is:"+sum);
			System.out.println("Average of element is array:"+(sum/arr.length));
			sc.close();
		}
		/*catch(ArithematicException a)
		{
			System.out.println(a.getClass());
			System.out.println(a.getMessage());
			
			 
		}*/
		catch(InputMismatchException i)
		{
			System.out.println(i.getClass());
			System.out.println(i.getMessage());
			
		}
		/*catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(a.getClass());
			System.out.println(a.getMessage());
			
		}*/
		/*catch(Exception a)
		{

			System.out.println(a.getClass());
			System.out.println(a.getMessage());
			
		}*/
	}

}
