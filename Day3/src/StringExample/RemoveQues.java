package StringExample;

import java.util.Scanner;

public class RemoveQues {
	public void  removeManual(String s)
	{
		System.out.println("Manual Remove");
		System.out.print("Current String"+s);
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any character to remove");
		char ch=sc.next().charAt(0);
		char str[]=s.toCharArray();
		String news="";
		for(int i=0;i<s.length();i++)
		{
			if(str[i]!=ch)
			{
				news=news+str[i];
				
			}
		}
		System.out.println(news);
		sc.close();
		
	}

	public static void main(String[] args)
	{
	
		

	}

}
