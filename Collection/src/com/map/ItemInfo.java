package com.map;


	import java.util.Comparator;
import java.util.TreeMap;

	public class ItemInfo 
	{
	    TreeMap <Item,Supplier> tp;
	    TreeMap<Item,String> tp1;
		
	    ItemInfo()
		{
			tp = new TreeMap<>(new SortByCost());
			
		}
	     
	    public void createMap()
	    {
	    	tp.put(new Item(1,"Pen", 400) ,new Supplier(101,"ABC"));
	    
	    	tp.put(new Item(2,"Notebook", 200) ,new Supplier(102,"DEF"));
	    	tp.put(new Item(3,"Bag", 300) ,new Supplier(103,"GHI"));
	    	System.out.println(tp);
	    }
		public static void main(String[] args) 
		{
			ItemInfo obj = new ItemInfo();
			obj.createMap();

		}

	}


