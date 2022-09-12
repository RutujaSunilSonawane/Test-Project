package AssignmentCollections;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Integer>number=new TreeSet<>();
		number.add(12);
		number.add(13);
		number.add(11);
		number.add(10);
		number.add(14);
		System.out.println(number);
		System.out.println("Hashset:"+number.headSet(12));
		System.out.println("TailSet:"+number.tailSet(12));
		TreeSet<Integer>num=new TreeSet<>();
		num.addAll(number);
		System.out.println(num);
		
		/*System.out.println("Ceiling:"+num.ceiling(12));
		System.out.println("Higher:"+num.higher(12));
		System.out.println("floor:"+num.floor(12));
		System.out.println("lower:"+num.lower(12));
		System.out.println("pollfirst:"+num.pollFirst());
		System.out.println("polllast:"+num.pollLast());
		System.out.println("Decending set:"+num.descendingSet());*/

	}

}
