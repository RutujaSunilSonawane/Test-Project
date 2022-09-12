import java.util.ArrayList;

public class MethodsOfArray {
	public void createList()
	{
		ArrayList<String>list=new ArrayList<>();
		list.add("Rutuja");
		list.add("Vaishnavi");
		list.add("Ovi");
		list.add("Sakshi");
		System.out.println("Original List:"+list);
		
	}

	public static void main(String[] args) {
		MethodsOfArray obj=new MethodsOfArray();
		obj.createList();

	}

}
