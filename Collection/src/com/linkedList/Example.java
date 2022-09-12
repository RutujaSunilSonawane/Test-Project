package com.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Example {

	public static void main(String[] args) {
		LinkedList<String>al=new LinkedList<>();
		al.add("Nikhil");
		al.add("Ajay");
		al.add("Nikhil");
		al.add("Ravi");
		Iterator<String>itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
