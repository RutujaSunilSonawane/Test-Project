package AssignmentCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(384);
		list.add(384);
		list.add(1232);
		list.add(4546);
		list.add(857);
		list.add(4689);
		list.add(4586);
		list.add(4586);
		System.out.println(list);
		HashSet<Integer>set=new HashSet<>(Arrays.asList());
		set.addAll(list);
		//Collections.addAll(null, null)
		System.out.println("Unique element:"+set);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("After sorting and reverce order:"+list);
		
	
		Iterator<Integer>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}


	}

}
