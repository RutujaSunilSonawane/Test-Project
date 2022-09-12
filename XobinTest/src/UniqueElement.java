import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueElement {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the number");
		for(int i=0;i<10;i++)
		{
			al.add(sc.nextInt());
		}
		LinkedHashSet<Integer>hs=new LinkedHashSet<>(al);
		ArrayList<Integer>al1=new ArrayList<>(hs);
		Iterator<Integer>itr=al1.iterator();
		while(itr.hasNext())
		{
			Integer i=itr.next();
			System.out.print(i+" ");
		}
		
		

	}

}
