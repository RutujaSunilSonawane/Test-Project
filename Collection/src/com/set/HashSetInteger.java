package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetInteger {

	public static void main(String[] args) {
		HashSet<Integer>s=new HashSet<>();
		s.add(12);
		s.add(34);
		s.add(567);
		s.add(345);
		
		System.out.println(s);
		Iterator<Integer>itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
