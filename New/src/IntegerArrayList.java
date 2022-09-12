import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IntegerArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list=new ArrayList<>();
		list.add(12);
		list.add(23);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		
		System.out.println(list);
		//Collections.sort(list);
		//System.out.println("After sorting:"+list);
		//Collections.reverseOrder();
		Collections.reverse(list);
		System.out.println("reverce order:"+list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		
		Iterator<Integer>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		}

}
