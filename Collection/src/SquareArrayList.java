import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SquareArrayList 
{
	
	
	public void createList()
	{
		ArrayList<Integer>no=new ArrayList<>();
		System.out.println(no);
		no.add(2*2);
		no.add(3*3);
		no.add(4*4);
		no.add(5*5);
		System.out.println(no);
		
		
		
	}
	public static void main(String[] args)
	{
		SquareArrayList obj=new SquareArrayList();
		obj.createList();

	

	}

}
