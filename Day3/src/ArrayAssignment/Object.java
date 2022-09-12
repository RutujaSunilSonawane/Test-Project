package ArrayAssignment;

import StringExample.Item;

public class Object {

	public static void main(String[] args) {
		Item o=new Item(120,1200,"Rutuja");
		System.out.println(o);
		Item o1=new Item(120,1200,"Rutuja");
		System.out.println(o1);
		System.out.println(o==o1);
	}

}
