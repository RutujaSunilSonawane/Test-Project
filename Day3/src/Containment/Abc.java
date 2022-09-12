package Containment;

import java.util.Scanner;

public class Abc {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str =sc.nextLine();
		int len=str.length();
		if(len>=3)
		{
			System.out.println(str.concat("ing"));
			System.out.println(str.concat("ly"));
		}
		else
			if(len<3)
			{
				System.out.println(str);
			}
		

	}

}
