package StringExample;

public class StringCnt
{
		public void stringCnt(String str)
		{
			
			
			char[] ch=str.toCharArray();
			int sum=0;
			for(int i=0;i<ch.length;i++)
			{
				if(Character.isDigit(ch[i]))
				{
					System.out.println("Digit of string:"+ch[i]);
					System.out.println();
					
					
					int no=Integer.parseInt(String.valueOf(ch[i]));
					sum=sum+no;
				}
			}
			System.out.println("Sum of digits is:"+sum);
		}
	public static void main(String[] args)
	{
		String str="sdfs1f3dfd3dfg45";
		StringCnt s=new StringCnt();
		s.stringCnt(str);
	}

}
