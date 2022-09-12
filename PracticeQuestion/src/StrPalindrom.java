import java.util.Scanner;

public class StrPalindrom {

	public static void main(String[] args)
	{
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev="";
		int len=str.length();
		for(int i=len-1;i >=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		

	}

}
