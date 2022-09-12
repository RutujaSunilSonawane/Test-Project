import java.util.Arrays;
import java.util.HashSet;

public class UniqueOfString
{
	public void display()
	{
		String str="Rutuja  Vaishnavi Rutuja  Ovi  Sanskruti Shreya";
		String[] name=str.split(" ");
		HashSet<String>uniqueName=new HashSet<String>(Arrays.asList(name));
		for(String s:uniqueName)
		{
			System.out.println(s);
		}
		
	}

	public static void main(String[] args) {
		UniqueOfString obj=new UniqueOfString();
		obj.display();

	}

}
