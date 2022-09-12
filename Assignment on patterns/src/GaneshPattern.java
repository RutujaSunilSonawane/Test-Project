
public class GaneshPattern {

	public static void main(String[] args) 
	{
		for(int j=1;j<=3;j++)
		{
			for(int k=1;k<=11-j+1;k++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=((j*j)+2-j)/2;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int j=1;j<=3;j++)
		{
			for(int k=1;k<=2*(4-j+1);k++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2+(4*j);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=2;i++)
		{
			for(int u=1;u<=2-i+1;u++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int u=1;u<=i*(i*i)-(i*i);u++)
			{
				System.out.print(" ");
			}
			for(int u=1;u<=2*(2-i+1)-i;u++)
			{
				System.out.print("*");
			}
			for(int u=1;u<=2*(5-i+1);u++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int u=1;u<=i*(i*i)-(i*i);u++)
			{
				System.out.print(" ");
				
			}
			for(int u=1;u<=2*(2-i+1)-1;u++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int u=1;u<=3;u++)
		{
			for(int v=1;v<=u;v++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int v=1;v<=(11-u+1)/2;v++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int v=1;v<=5-u+1;v++)
			{
				System.out.print(" ");
				
			}
			for(int v=1;v<=1-u+1;v++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		for(int u=1;u<=4;u++)
		{
			for(int v=1;v<=6+u;v++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
		}
		System.out.println();
		
		
		

	}

}
