package StringExample;

import java.util.Scanner;

public class RemoveString
{
	String s,s2;
	 char ch;
	public  void removeCharacter(String s)
	{
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=ch)
			{
				s1+=s.charAt(i);
			}
		}
		System.out.println("After remove Character:");
	}
	public void findOccurance(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			int cnt=1;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					cnt++;
					
				}
			}
			System.out.println(s.charAt(i)+"occurs"+cnt+"times");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String");
		String s=sc.next();
		System.out.println("Enter the Second String");
		String s1=sc.next();
		
		RemoveString r=new RemoveString();
		r.removeCharacter(s);
		
		
	}
	
}
