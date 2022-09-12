import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniqueArrayList
{
	public void display()
	{
		ArrayList<Integer> number=new ArrayList<>();
		number.add(12);
		number.add(13);
		number.add(12);
		number.add(14);
		number.add(15);
		System.out.println(number);
		HashSet<Integer> num= new HashSet<Integer>(number);
		//List<Integer> num= new List<Integer>(number);
		System.out.println("Unique value:"+num);
		
		
	}

	public static void main(String[] args) {
		UniqueArrayList obj=new UniqueArrayList();
		obj.display();

	}

}
