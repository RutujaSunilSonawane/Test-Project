package com.HashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class ExampleRemove {

	public static void main(String[] args) {
		//HashMap<Integer,String>hm=new HashMap<>();
		//LinkedHashMap<Integer,String>hm=new LinkedHashMap<>();
		//TreeMap<Integer,String>hm=new TreeMap<>();
		Hashtable<Integer,String>hm=new Hashtable<>();
		hm.put(101, "Rutuja");
		hm.put(102, "Rohit");
		hm.put(103, "Nikhil");
		hm.put(104, "Kajal");
		System.out.println("Values before removing:"+hm);
		hm.remove(101);
		System.out.println("Values after removing:"+hm);
		

	}

}
