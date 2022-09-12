package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Student
{
	HashMap<Integer,Float> mp;
	public Student()
	{
		mp=new HashMap<Integer,Float>();
		System.out.println("Map is:"+mp);
	}
	public void prepareMap()
	{
		mp.put(12, 44.00f);
		mp.put(13, 56.00f);
		mp.put(14, 50.00f);
		System.out.println("Now map is:"+mp);
		//mp.remove(12);
		//System.out.println("After Removing 12 Key");
		//System.out.println("Size of map :"+mp.size());
	//	Set<Integer>set=mp.keySet();
		//System.out.println("Set of keys:"+set);
		//Iterator<Integer>itr=set.iterator();
	//	System.out.println("Iterator :"+itr);
		//while(itr.hasNext())
		//{
			//Integer key=itr.next();
			//System.out.println(key+" = "+mp.get(key));
			
		//}
		
	}
	
	

	public static void main(String[] args) {
		Student obj=new Student();
		//System.out.println("Size of map:"+obj.mp.size());
		obj.prepareMap();
		

	}

}
