import java.util.ArrayList;

public class ArrayListMethod
{
	public void createList()
	{
		ArrayList<String>list=new ArrayList<>();
		list.add("I");
		list.add("Am");
		list.add("Rutuja");
		list.add("Sakshi");
		list.add("Shiwani");
		System.out.println("Original list:"+list);
		
		ArrayList<String>list1=new ArrayList<>();
		System.out.println(list1);
		list1.add("I");
		list1.add("Am");
		
		System.out.println("Original list1:"+list1);
		//list.removeAll(list1);//Difference set
		//System.out.println("Remove all method:"+list);
		list.addAll(3,list1);			//Union Set
		System.out.println("Adding the List:"+list);
		list.retainAll(list1);			//Intersection Set(common)
		System.out.println("After Intersection Set:"+list);
		
	}

	public static void main(String[] args) 
	{
		ArrayListMethod a=new ArrayListMethod();
		a.createList();

	}

}
