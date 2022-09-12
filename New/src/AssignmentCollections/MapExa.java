package AssignmentCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExa {

	public static void main(String[] args) {
		//map does not maintain the order of insertion
		Map<Integer,String>map1=new HashMap<>();
		map1.put(1, "Rutuja");
		map1.put(2, "Rushali");
		map1.put(13,"Ovi");
		map1.put(43, "Vaishnavi");
		map1.put(5, "Shiwani");
		System.out.println(map1);
		//it maintain the order of elements in whichyou have added
		Map<Integer,String>map2=new LinkedHashMap<>();
		map2.put(1, "Rutuja");
		map2.put(2, "Rushali");
		map2.put(13,"Ovi");
		map2.put(43, "Vaishnavi");
		map2.put(5, "Shiwani");
		System.out.println(map2)		;
		Map<Integer,String>map3=new TreeMap<>();
		//to maintain the sorting
		map3.put(1, "Rutuja");
		map3.put(2, "Rushali");
		map3.put(13,"Ovi");
		map3.put(43, "Vaishnavi");
		map3.put(5, "Shiwani");
		System.out.println(map3);
		
		
		
	

	}

}
