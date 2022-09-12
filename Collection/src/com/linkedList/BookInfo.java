package com.linkedList;

import java.util.LinkedList;
import java.util.List;

public class BookInfo {

	public static void main(String[] args) {
		List<Book>list=new LinkedList<>();
		Book b1=new Book(101,500,"Panipat");
		Book b2=new Book(102,700,"A.P.J ");
		Book b3=new Book(103,800,"Swami Vivekanandan");
		list.add(b1);
		list.add(b2);
		list.add(b3);
		for(Book b:list)
		{
			System.out.println(b.bId+" "+b.bPrice+" "+b.bName);
		}

	}

}
