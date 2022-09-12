package AssignmentCollections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set names=new HashSet<>();
		names.add("Rutuja");
		names.add("Rushali");
		names.add("Ovi");
		names.add("Rutuja");
		names.add("Ovi");
		names.add("Shreya");
		names.add("Rushali");
		names.add(null);
		System.out.println(names);

	}

}
