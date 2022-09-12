package com.HashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example {

	public static void main(String[] args) {
		//HashMap<Integer,String>hm=new HashMap<>();
		//LinkedHashMap<Integer,String>hm=new LinkedHashMap<>();
		//TreeMap<Integer,String>hm=new TreeMap<>();
		Hashtable<Integer,String>hm=new Hashtable<>();
		hm.put(101,"Rutuja");
		hm.put(102, "Nikhil");
		hm.put(103, "Rohit");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
