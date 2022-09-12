package AssignmentCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListString {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		list.add("Rutuja");
		list.add("Kajal");
		list.add("Ovi");
		list.add("Rushali");
		list.add("Vaishnavi");
		list.add("Shreya");
		System.out.println(list);
		for(String obj:list)
		{
			System.out.println(obj);
		}
		list.remove("Ovi");
		
		System.out.println("After removing:"+list);
		Iterator<String>itr=list.iterator();
		while(itr.hasNext())
		{
			//System.out.println("After iteration:"+itr.next());
			String o=(String)itr.next();
			int size=o.length();
			if(size>5)
			{
				itr.remove();
			}
			
		}
		System.out.println("Iterator list:"+list);
		
		

	}

}
