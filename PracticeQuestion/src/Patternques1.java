
public class Patternques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print pattern pyramid star//
		for(int i=0;i<6;i++)
		{
			for(int j=6-i;j>1;j--)
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
