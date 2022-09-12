
public class Forloop1 {

	public static void main(String[] args)
	{
		
		int i;
		for(i=2;i<=10;i++)
		{
			if(i==6)
				continue;
			for(int j=1;j<=10;j++)
			{
				if(j==5)
					continue;
					System.out.print(i*j+"  ");
			}
			System.out.println();
		}
		
		

	}

}
