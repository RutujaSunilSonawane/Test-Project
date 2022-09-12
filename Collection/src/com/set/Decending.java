package com.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Decending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>s=new TreeSet<>();
		s.add("kkk");
		s.add("ppp");
		//s.add("kkk");
		s.add("eav");
		s.add("rutuja");
		s.add("abc");
		System.out.println(s);
		
		TreeSet<String>ss=new TreeSet<>(Collections.reverseOrder());
		ss.add("kkk");
		ss.add("ppp");
		//s.add("kkk");
		ss.add("eav");
		ss.add("rutuja");
		ss.add("abc");
		System.out.println("Reverce order");
		System.out.println(ss);
		
	
		
		
		
		
		
		

	}

}
