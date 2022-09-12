package com.set;

import java.util.HashSet;

public class ExampleHashSet {

	public static void main(String[] args) {
		HashSet<Object>set=new HashSet<Object>();
		set.add(45);
		set.add("Rutuja");
		set.add(55);
		set.add("Vaishnavi");
		set.add("Rutuja");
		System.out.println(set);

	}

}
