
public class Arrconvertcaseprint {

	public static void main(String[] args) {
		char c[]= {'a','F','j','K','e','i','T','H','v','S'};
		for(int i=0;i<c.length;i++)
		{
			if(c[i] >'a' && c[i] <='z')
			{
				c[i]=(char) ((int) c[i] -32);
			}
			else
			{
				if(c[i] >='A' && c[i] <='z')
				{
					c[i]=(char) ((int ) c[i]+32);
				}
				System.out.print(c[i]+" ");
			}
		}

	}

}
