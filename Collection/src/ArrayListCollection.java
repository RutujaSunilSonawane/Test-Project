import java.util.ArrayList;

public class ArrayListCollection
{
	public void createList()
	{
		ArrayList list=new ArrayList();
		System.out.println(list);
		list.add("Rutuja");
		list.add(new Integer(56));
		list.add(34);
		list.add(45.89f);
		list.add(34);
		
		ArrayList list1=new ArrayList();
		System.out.println(list1);
		list1.add(34);
		list1.add(78);
		list1.add(90);
				
		//list.remove("Rutuja");
		//list.removeAll(list1);
		list.retainAll(list);					//Intersection 
		//list.addAll(list);						//Union Set
		System.out.println(list1);
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
				
	}
	public static void main(String[] args) {
		ArrayListCollection a =new ArrayListCollection();
		a.createList();

	}

}
