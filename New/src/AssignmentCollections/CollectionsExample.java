package AssignmentCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionsExample {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(12);
		al.add(21);
		al.add(21);
		al.add(23);
		al.add(34);
		al.add(22);
		al.add(13);
		al.add(13);
		
	System.out.println(al);
	HashSet<Integer>set=new HashSet<>();
	set.addAll(al);
	System.out.println("Unique elements:"+set);
	Collections.sort(al);
	System.out.println("After sorting elementL:"+al);
	Collections.reverse(al);
	System.out.println("After reverce:"+al);
	Collections.sort(al, Collections.reverseOrder());
	System.out.println(al);
	Iterator<Integer>itr=al.iterator();
	while(itr.hasNext())
	{
		Integer c=itr.next();
		if(c%2==0)
		{
			System.out.println("Even number:"+c);
		}
		else
		{
			System.out.println("Odd number:"+c);
		}
	}
	
		
		

	}

}
