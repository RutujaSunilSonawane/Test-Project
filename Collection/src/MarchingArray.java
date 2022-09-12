import java.util.ArrayList;

public class MarchingArray
{
	public void creteList()
	{
		//One ArrayList
		ArrayList<String>list=new ArrayList<>();
		System.out.println(list);
		list.add("Rutuja");
		list.add("Vaishnavi");
		list.add("Kajal");
		list.add("Ovi");
		//Second ArrayList
		ArrayList<String>list1=new ArrayList<>();
		list1.add("Nikhil");
		list1.add("Rohit");
		list1.add("Prasad");
		//new ArrayList
		ArrayList<String> al=new ArrayList<>();
		al.addAll(list);
		al.addAll(list1);
		
		for(String name:al)
		{
			System.out.println(name);
		}
		
		
	}

	public static void main(String[] args) 
	{
		MarchingArray obj=new MarchingArray();
		obj.creteList();

	}

}
