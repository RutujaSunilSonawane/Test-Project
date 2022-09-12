package AssignmentCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateList {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		System.out.println(list);
		list.add("Rutuja");
		list.add("Pooja");
		list.add("Vaishnavi");
		list.add("Rushali");
		list.add("Ovi");
		System.out.println(list);
		Iterator<String>itr=list.iterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			String name=itr.next();
			if(name.equals("Vaishnavi"))
			{
				itr.remove();
				System.out.println("After removing list:"+list);
			}
		}
		//by using listIterator
		/*ListIterator<String>litr;
		for(litr=list.listIterator();litr.hasNext();litr.next())
		{
			String name=litr.next();
			System.out.println(name);
		}*/
		ListIterator<String>litr=list.listIterator(list.size());
		while(litr.hasPrevious())
		{
			System.out.println("ListIterator reverce:"+litr.previous());
		}
		
	}

}
