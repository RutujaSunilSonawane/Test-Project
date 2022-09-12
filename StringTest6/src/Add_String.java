import java.util.Scanner;

public class Add_String
{
	public void addIng(String s1)
	{
		int no=s1.length();
		if(no>3)
		{
			String s2="";
			String s3="";
			String s4="ly";
			String s5="ing";
			for(int i=s1.length()-1,cnt=1;i>=0;i--,cnt++)
			{
				s2=s2+s1.charAt(i);
				if(cnt==3)
					break;
				
			}
			for(int i=s1.length()-1;i>=0;i--)
			{
				s3=s3+s2.charAt(i);
			}
			if(s3.equals(s5))
			{
				String s6=s1+s4;
				System.out.println(s6);
			}
			else
			{
				String s6=s1+s5;
				System.out.println(s6);
			}
			
			
		}
		else
		{
			System.out.println(s1);
		}
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.next();
		Add_String o=new Add_String();
		o.addIng(s1);
		

	}

}
