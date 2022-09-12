package AssignmentCollections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<>();
		list.add(12);
		list.add(13);
		list.add(45);
		list.add(14);
		list.add(67);
		//list.remove(0);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.size());
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
		System.out.println(list);
		
		

	}

}
