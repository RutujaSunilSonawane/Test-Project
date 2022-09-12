import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class StringIteratorList {
	public void createList()
	{
		ArrayList<String>list=new ArrayList<>();
		list.add("Rutuja");
		list.add("Vaishnavi");
		list.add("Rakhi");
		list.add("Ovi");
		 System.out.println("Original List:"+list);
		// Collections.reverse(list);
		// System.out.println("Reverce :"+list);
		
		 Iterator itr = list.iterator(); 
		
		    while (itr.hasNext())  
		    {
		    	String o=(String) itr.next();
		    	int size=o.length();
		    	if(size>5)
		    	{
		    		itr.remove();
		    		
		    	}
		    }
		    System.out.println("Iterator List:"+list);
		  
	}
	public static void main(String[] args) {
		StringIteratorList obj=new StringIteratorList();
		obj.createList();
		
		

	}

}
