package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>map=new HashMap<>();
		map.put(101, "Nikhil");
		map.put(102, "Rutuja");
		map.put(103, "Kajal");
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		

	}

}
