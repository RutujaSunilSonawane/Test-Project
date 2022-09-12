package AssignmentCollections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<>();
		map.put(1, "Rutuja");
		map.put(2, "Rushali");
		map.put(3,"Ovi");
		map.put(4, "Vaishnavi");
		map.put(5, "Shiwani");
		
		System.out.println(map);
		map.remove(5);
		System.out.println("After removing:"+map);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.containsKey(13));
		System.out.println(map.containsValue("Shiwani"));
		

	}

}
