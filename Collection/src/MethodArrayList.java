import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodArrayList {
	public void creatList()
	{
		String h[]= {"reading","music","dancing","writting"};
		//Convert Array to list way1:using Arrays.asList()
		/*List<String> hobbies=Arrays.asList(h);
		System.out.println("List of hobbies....");
		for(String hb:hobbies)
		{
			System.out.println(hb);
		}
		ArrayList<String>hobbies1=new ArrayList<>(Arrays.asList(h));
		System.out.println("List of hobbies1....");
		for(String hb:hobbies1)
		{
			System.out.println(hb);
		}*/
		//Convert Array to list way 2:Using collections.addAll()
		ArrayList<String>hobbies2=new ArrayList<String>();
		Collections.addAll(hobbies2, h);
		System.out.println("List of hobbies2....");
		for(String hb:hobbies2)
		{
			System.out.println(hb);
		}
		Collections.addAll(hobbies2, "cooking","watching TV");
		System.out.println(hobbies2);
		
		//sort()
		Collections.sort(hobbies2);
		System.out.println("After sorting :"+hobbies2);
		
		
		//Collection toArray() way1
		Object[] newhobbies=hobbies2.toArray();
		System.out.println("Array List to converted into object Array....");
		System.out.println(Arrays.toString(newhobbies));
		
		//Concert collection toArray() way2
		String str[]=new String[hobbies2.size()];
		hobbies2.toArray(str);
		System.out.println("Array List Converted to String Array");
		System.out.println(Arrays.toString(str));
		
		
		
				
	}

	public static void main(String[] args) 
	{
		MethodArrayList obj=new MethodArrayList();
		obj.creatList();
	

	}

}
