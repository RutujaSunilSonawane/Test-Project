package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Election {

	public static void main(String[] args) {
		Map<String,String>hashMap=new HashMap<>();
		hashMap.put("mr.abc", "BJP");
		hashMap.put("mr.xyz", "NCP");
		hashMap.put("mr.ccc", "BJB");
		hashMap.put("mr.lll", "shivsena");
		System.out.println(hashMap);
		HashMap<String,Integer>hashMap1=new HashMap<>();
		Set<Entry<String,String>>entrySet=hashMap.entrySet();
		Iterator<Entry<String,String>>itr=entrySet.iterator();
		

	}

}
