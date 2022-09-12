
public class Patternques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print pattern//
		for(int i=0;i<6;i++)
		{
			for(int j=1*(6-1);j>=0;j--)
			{
				System.out.print("");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
