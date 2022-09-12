
public class StringCount
{
	public void cnt(String str)
	{
		
		char[] ch=str.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				System.out.println();
			int no=Integer.parseInt(String.valueOf(ch[i]));
			sum=sum+no;
		}
		
	}
	System.out.println(sum);
	}


	public static void main(String[] args) {
		StringCount obj=new StringCount();
		obj.cnt("avd4njh4jkn6j6");

	}

}
