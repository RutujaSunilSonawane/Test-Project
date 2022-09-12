package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class Example {

	public static void main(String[] args) {
		HashSet<String>set=new HashSet<>();
		set.add("Rutuja");
		set.add("Nikhil");
		set.add("Ajay");
		set.add("Kajal");
		Iterator<String>itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
