package Interface;

import java.util.Scanner;

public class StringCharAccurance {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s="Java is a good programming language";
		int count=0;
		char ch;
		ch=sc.next().charAt(0);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
				count++;
		}
		System.out.println(count);
		sc.close();
		

	}

}
