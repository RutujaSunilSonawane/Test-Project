import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class IteratorListExample {
	public void creatList()
	{
		ArrayList<String>list=new ArrayList<>();
		System.out.println(list);
		list.add("Rutuja Sonawane");
		list.add("Nikhil Sonawane");
		list.add("Kajal Sonawane");
		list.add("Sakshi Ugale");
		list.add("Shital Pingale");
		//Iterator list using Iterator
	   /* Iterator<String> itr=list.iterator();
	    		while(itr.hasNext())
	    		{
	    			String name=itr.next();
	    			System.out.println(name);
	    		}
	    		//Removing uderlying collection object  while iterating
	    		   Iterator<String> itr1=list.iterator();
		    		while(itr.hasNext())
		    		{
		    			String name=itr.next();
		    			if(name.equals("Nikhil Sonawane"))
		    			{
		    				itr.remove();
		    				System.out.println("Object Removed");
		    			}
		    		}
		    		System.out.println(list);*/
		    		//Iterating list using listIterator
		    		
		    		/*System.out.println("Using ListIterator:");
		    		ListIterator<String>litr;
		    		for(litr=list.listIterator();litr.hasNext();litr.next())
		    		{
		    			String name=litr.next();
		    			System.out.println(name);
		    		}*/
		    		
		    		//Iterating list in reverse using list Iterator
		    		
		    		System.out.println("List in reverse using ListIterator");
		    		ListIterator<String>litr1=list.listIterator();list.size();
		    		while(litr1.hasPrevious())
		    		{
		    			String name=litr1.previous();
		    			System.out.println(name);
		    		}
		
		
	}

	public static void main(String[] args) 
	{
		IteratorListExample obj=new IteratorListExample();
		obj.creatList();
	

	}

}