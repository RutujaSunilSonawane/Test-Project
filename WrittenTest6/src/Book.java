import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Book 
{
	int bookId,bookPrice;
	String bookName,bookAuther;
	Book()
	{
		
	}
	Book(int bookId,int bookPrice,String bookName,String bookAuther)
	{
		this.bookId=bookId;
		this.bookPrice=bookPrice;
		this.bookName=bookName;
		this.bookAuther=bookAuther;
	}
	public String toString()
	{
		return bookId+" "+bookPrice+" "+bookName+" "+bookAuther;
	}
	public static void main(String[] args)
	{
		List<Book>b=new LinkedList<>();
		b.add(new Book(101,300,"Panipat","ABC"));
		b.add(new Book(102,400,"Shree swami samarth","PQR"));
		b.add(new Book(103,500,"Pavankhind","XYZ"));
		System.out.println(b);
		Set<String>list=new HashSet<String>();
		list.add("ABC");
		list.add("PQR");
		list.add("XYZ");
		System.out.println(list);
		Iterator<String>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		TreeSet<Book>set=new TreeSet<>();
		Collections.reverse(b);
		System.out.println(b);
		
				
		

	}

}
//Consider Book class with properties bookId, bookName, bookPrice,bookAuther. List of Book type is available already. 