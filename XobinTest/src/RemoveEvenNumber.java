import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveEvenNumber {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		for(int i=0;i<=10;i++)
		{
			al.add(sc.nextInt());
		}
		Iterator<Integer>itr=al.iterator();
		while(itr.hasNext())
		{
			Integer c=itr.next();
			if(c%2!=0)
			{
				System.out.println(c+" ");
			}
		}

	}

}
