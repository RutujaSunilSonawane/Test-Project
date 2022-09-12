package StringExample;

import java.util.Scanner;

public class ConsonantVowel
{
	public void consonantVowelChar(String str)
	{
		int vCnt=0,cCnt=0,digits=0,spaces=0,specialChar=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				vCnt++;
			}
			else if(ch>='a'&& ch<='z'||ch>='A'&& ch<='Z')
			{
				cCnt++;
			}
			else if(ch>='0'&& ch<='9')
			{
				digits++;
			}
			else if(ch==' ')
			{
				spaces++;
			}
			else
			{
				specialChar++;
			}
		}
		System.out.println("Total Number of Vowel:"+vCnt);
		System.out.println("Total Number of consonant:"+cCnt);
		System.out.println("Total Number of digits:"+digits);
		System.out.println("Total Number of spaces:"+spaces);
		System.out.println("Total Number of specialChar:"+specialChar);
		
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		ConsonantVowel obj=new ConsonantVowel();
		obj.consonantVowelChar(str);
		sc.close();
	

	}

}
