import java.util.ArrayList;

public class Array {
	public void addElement(ArrayList<String> l)
	{
		System.out.println("Original List");
		l.add("I");
		l.add("Am");
		l.add("Rutuja");
		
		showElement(l);
	}
	public void showElement(ArrayList<String> l)
	{
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		revElement(l);
	}
	public void revElement(ArrayList<String> l)
	{
		System.out.println("Reverse List");
		for(int i=l.size()-1;i>=0;i--)
		{
			System.out.println(l.get(i));
		}
	}

	public static void main(String[] args) {
		Array obj=new Array();
		ArrayList<String> l=new ArrayList<>();
		
		obj.addElement(l);

	}

}
