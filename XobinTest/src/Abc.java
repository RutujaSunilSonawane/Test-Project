import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SortByLength implements Comparator<String>
{
	public int compare(String o1,String o2)
	{
		return o1.length() - o2.length();
	}
}
public class Abc {
	public ArrayList<String> arrangeWords(ArrayList<String>al)
	{
		Collections.sort(al,new SortByLength());
		return al;
	}
	public ArrayList<String>prepareList(String s)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String>list=new ArrayList<String>();
		String[] word=s.split(" ");
		for(String val:word)
		{
			if(val !=" ")
			{
				list.add(val);
			}
		}
		list=arrangeWords(list);
		return list;
		
	}

	public static void main(String[] args) {
		Abc obj=new Abc();
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		ArrayList<String>list1=new ArrayList<String>();
		list1=obj.prepareList(str);
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i)+" ");
		}
		
		

	}

}
