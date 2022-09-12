import java.util.ArrayList;
import java.util.ListIterator;
public class ListIteratorExample {
	public void createList()
	{
		ArrayList<String> name=new ArrayList<>();
		System.out.println(name);
		name.add("Rutuja");
		name.add("Kajal");
		name.add("Rushi");
		name.add("Rushali");
		name.add("Nikhil");
		System.out.println("Element of second position:"+name.get(2));
		ListIterator<String> itr=name.listIterator();
		System.out.println("Traversing in forword direction");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Traversing in backword direction");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}

	public static void main(String[] args) 
	{
		ListIteratorExample obj=new ListIteratorExample();
		obj.createList();
		

	}

}
