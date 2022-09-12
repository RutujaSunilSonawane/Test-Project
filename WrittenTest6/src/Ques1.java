import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ques1
{
	public void showArray()
	{
		List<String> l=new ArrayList();
		l.add("Rutuja");
		l.add("Kajal");
		l.add("Vaishnavi");
		l.add("Nikhil");
		String str[]=l.toArray(new String[l.size()]);
		System.out.println("Converting the ArrayList to Array");
		for(String s:l)
		{
			System.out.println(s);
		}
		System.out.println("Converting the Array to ArrayList");
		List<String>l2=new ArrayList();
		l2=Arrays.asList(str);
		System.out.println(l2);
	}

	public static void main(String[] args) {
	    Ques1 obj=new Ques1();
	    obj.showArray();

	}

}
