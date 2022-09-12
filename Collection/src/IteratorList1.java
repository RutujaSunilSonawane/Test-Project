import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorList1 {
	public void creteList()
	{
		ArrayList<String>name=new ArrayList<>();
		name.add("Rutuja");
		name.add("Kajal");
		name.add("Vaishnavi");
		name.add("Rushi");
		System.out.println(name.get(2));
		Iterator<String>itr=name.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

	public static void main(String[] args) {
		IteratorList1 obj=new IteratorList1();
		obj.creteList();

	}

}
