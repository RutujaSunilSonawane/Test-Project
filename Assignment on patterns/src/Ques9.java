
public class Ques9 {
	

	public static void main(String[] args)
	{
		for(int i=0;i<=6;i++)
		{
			int x=0;
			int y=1;
			int z=0;
			for(int j=0;j<i;j++)
			{
				z=x+y;
				System.out.print(x+" ");
				x=y;
				y=z;
			}
			System.out.println();
		}

	}

}
