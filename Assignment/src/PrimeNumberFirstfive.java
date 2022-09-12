import java.util.Scanner;

public class PrimeNumberFirstfive 
{
	

		public static void main(String[] args)
		{
			int count=0,num=0,i=1,j=1;
			while(num<10)
			{
				j=1;
				count=0;
				while(j<=i)
				{
					if(i%j==0)
						count++;
					j++;
					
				}
				if(count==2)
				{
					System.out.println(i);
					num++;
				}
				i++;
			}
				}
			

}
