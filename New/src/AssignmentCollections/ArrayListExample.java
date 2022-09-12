package AssignmentCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer>l1=new ArrayList<>();
		l1.add(2);
		l1.add(31);
		l1.add(4);
		l1.add(5);
		l1.add(16);
		l1.add(7);
		l1.add(18);
		l1.add(9);
		l1.add(10);
		SortedSet<Integer>l=new TreeSet<>();
		l.addAll(l1);
		System.out.println("Asending order:"+l);
		
		l1.remove(0);
		System.out.println(l1);
		System.out.println(l1.size());
		boolean ans=l1.contains(166);
		
		System.out.println("After contains:"+ans);
		
		System.out.println("The list of size:"+l1.size());
		for(Integer Number:l1)
		{
			System.out.println(Number);
		}
		
		Collections.sort(l1);
		System.out.println("After sorting :"+l1);
		//Collections.reverse(l1);
		//System.out.println("revercs order:"+l1);
		Collections.sort(l1, Collections.reverseOrder());
		System.out.println("Reverce order:"+l1);
		
		Iterator<Integer>itr=l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
			
			
			
		}
		System.out.println(l1);
		

	}
	

}
