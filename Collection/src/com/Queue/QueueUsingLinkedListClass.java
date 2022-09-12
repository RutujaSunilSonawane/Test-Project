package com.Queue;

import java.util.LinkedList;

public class QueueUsingLinkedListClass {
		LinkedList<String>s=new LinkedList<>();
	public static void main(String[] args) {
		QueueUsingLinkedListClass obj=new QueueUsingLinkedListClass();
		obj.s.add("Rutuja");
		obj.s.add("Ovi");
		obj.s.add("Vaishnavi");
		obj.s.addFirst("Sonawane");
		obj.s.addLast("ABC");
		System.out.println(obj.s);
		obj.s.removeLast();
		System.out.println(obj.s);
		
		

	}

}
