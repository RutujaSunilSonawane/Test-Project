package AssignmentString;

import java.util.Scanner;

public class RevereString 
{
	public void reverce() 
	{
		String rev=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String str=sc.next();
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		//System.out.println(rev);
		if(str.equals(rev))
		{
			System.out.println("Palinfrome");
		}
		else
		{
			System.out.println(" not a Palinfrome");
		}
		
	}
	public void palindrome()
	{
		String rev=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String str=sc.next();
		for(int i=str.length()-1;i>=0;i--)
			
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println(str+"Given name is palindrome");
		}
		
	}

	public static void main(String[] args) {
		RevereString  obj=new RevereString ();
		obj.reverce();
		//obj.palindrome();

	}

}
