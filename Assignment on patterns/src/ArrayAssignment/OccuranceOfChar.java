package ArrayAssignment;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class OccuranceOfChar
{
	public void occuranceChar()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		System.out.println("Enter char to count occurance in given string=");
		String str1=sc.nextLine();
		String temp[]=str.split(" ");
		System.out.println(Arrays.toString(temp));
		int cnt=0;
		for(int i=0;i<temp.length;i++)
		{
			if(str1.equals(temp[i]))
				cnt++;
		}
		System.out.println("the String is:"+str);
		System.out.println("the char"+str1+"occurs"+cnt+"times in the above string");
		sc.close();
	}

	public static void main(String[] args) 
	{
		OccuranceOfChar obj=new OccuranceOfChar();
		obj.occuranceChar();

	}

}
