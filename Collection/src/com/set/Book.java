package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class Book {
	int bId;
	String bName;
	float bPrice;
	Book(){
		
	}
	Book(int bId,String bName,float bPrice)
	{
		this.bId=bId;
		this.bName=bName;
		this.bPrice=bPrice;
	}
	public String toString()
	{
		return bId+" "+bName+" "+bPrice;
	}

	public static void main(String[] args) {
		HashSet<Book>set=new HashSet<>();
		set.add(new Book(101,"Panipat",500));
		set.add(new Book(102,"A.P.J",700));
		set.add(new Book(103,"Swami Vivekanandan",800));
		Iterator<Book>itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}
