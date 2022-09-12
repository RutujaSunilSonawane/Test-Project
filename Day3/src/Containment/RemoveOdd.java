package Containment;

public class RemoveOdd 
{
	static String removeOddIndexCharacter(String s)
	{
		String new_string=" ";
		for(int i=0;i<s.length();i++)
		{
			if(i%2==1)
				continue;
			new_string=new_string+s.charAt(i);
		}
		return new_string;
	}
	public static void main(String[] args)
	{
		String str="Rutuja";
		
		str=removeOddIndexCharacter(str);
				System.out.print(str);
	}

}
