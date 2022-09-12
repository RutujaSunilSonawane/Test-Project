
public class ContinueTable2to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=10;i++)
		{
			if(i==6)
				continue;
			for(int j=1;j<=10;j++)
			{
			
				System.out.print(i*j+"  ");
			}
			System.out.println();
		}

	}

}
