import java.util.InputMismatchException;
import java.util.Scanner;

public class Average
{
	public void average()
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of array");
			int size=sc.nextInt();
			int a[]=new int[size];
			System.out.println("Enter the Array element");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			int sum=0;
			int avg=0;
			for (int i=0; i<=a.length; i++)        
				//for (int i=0; i<a.length; i++)
			{
			  sum = sum + a[i];
			}
			//avg = sum / a.length;
			avg = sum / 0;
			System.out.println(avg);
			
			sc.close();
		  }
		  
			catch ( ArithmeticException  e)
			{
			  System.out.println(" Error Type = "+e.getClass());
			  System.out.println(" Error Massage = "+e.getMessage());
			}
			
		//	catch(Exception e)
			{
			 // System.out.println(" Error Type = "+e.getClass());
			 // System.out.println(" Error Type = "+e.getMessage());
			}
		}

		public static void main(String[] args) 
		{
			
			
			Average b = new Average();
			b.average();

		}

			
		}
	

	
