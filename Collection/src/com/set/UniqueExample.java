package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class UniqueExample {

	public static void main(String[] args) {
		String s = "Yellow";
		String str[]=s.split("");
		HashSet<String>set=new HashSet<>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		Iterator<String>itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		

	}

}
