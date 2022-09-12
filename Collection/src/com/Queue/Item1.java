package com.Queue;

import java.util.PriorityQueue;

public class Item1 {
	int id;String iName;float iCost;
	Item1(){}
	Item1(int id,String iName,float iCost)
	{
		this.id = id;
		this.iName = iName;
		this.iCost = iCost;
	}
	
	public String toString()
	{
		return id+" "+iName+" "+iCost;
	}

	public static void main(String[] args) {
		PriorityQueue<Item1>s=new PriorityQueue<>();
		s.add(new Item1(101,"Mobile",30000));
		s.add(new Item1(102,"Laptop",50000));
		System.out.println(s);
			

	}

}
