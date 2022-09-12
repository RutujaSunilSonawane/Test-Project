package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class Laptop
{
	int lPrice;
	String lCompany;
	
	Laptop()
	{
		
	}
	Laptop(int p,String c)
	{
		lPrice=p;
		lCompany=c;
	}
	public String toString()
	{
		return lPrice+"  "+lCompany;
	}

	public static void main(String[] args)
	{
		HashSet<Laptop>s=new HashSet<>();
		s.add(new Laptop(3436578,"hp"));
		s.add(new Laptop(435668,"dell"));
		s.add(new Laptop(5869,"lenovo"));
		s.add(new Laptop(5478,"blue hp"));
		Iterator<Laptop>itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
		
		

	}

}
