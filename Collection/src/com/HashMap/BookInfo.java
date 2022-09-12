package com.HashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;



class Book
{
	int bId;
	float bPrice;
	String bName;
	Book(){
		
	}
	Book(int bId,float bPrice,String bName)
	{
		this.bId=bId;
		this.bPrice=bPrice;
		this.bName=bName;
	}
}
public class BookInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Map<Integer,Book>map=new HashMap<>();
		//Map<Integer,Book>map=new LinkedHashMap<>();
		//Map<Integer,Book>map=new TreeMap<>();
		Map<Integer,Book>map=new Hashtable<>();
		Book b1=new Book(101,500,"Panipat");
		Book b2=new Book(102,700,"A.P.J ");
		Book b3=new Book(103,800,"Swami Vivekanandan");
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
		for(Map.Entry<Integer,Book>entry:map.entrySet())
		{
			int key=entry.getKey();
			Book b=entry.getValue();
			System.out.println("Details:"+key);
			System.out.println(b.bId+" "+b.bPrice+" "+b.bName);
		}
		
	}

}
