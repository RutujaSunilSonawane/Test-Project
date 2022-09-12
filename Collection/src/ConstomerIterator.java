import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ConstomerIterator {
	ArrayList<Constomer> l;
	public ConstomerIterator()
	{
		l=new ArrayList<Constomer>();
		System.out.println(l);
	}
	public void prepareConstomerList()
	{
		Constomer o=new Constomer(12,22,"Ovi");
		l.add(o);
		l.add(new Constomer(13,23,"Rutuja"));
		l.add(new Constomer(14,24,"Rashi"));
		l.add(new Constomer(14,10,"Sai"));
		l.add(new Constomer(16,10,"Vaishnavi"));
		System.out.println(l);
		
	}
	public void changeAge()
	{
	
		ListIterator<Constomer> itr=l.listIterator();
		
		
		
	}
	public void showConsumer()
	{
		System.out.println("Using for each loop");
		Consumer<Constomer> c1=(str)-> System.out.println(str);
		l.forEach(c1);
	}
	public void showSort()
	{
		Collections.sort(l);
		System.out.println(l);
	}

	
	public void showConstomerList()
	{
		/*for(Constomer c: l)
		{
			System.out.println(c);
		}*/
		
	
		/*for(int i=0;i<l.size();i++)
		{
			Constomer cb=l.get(i);
			
			System.out.println(cb);
		}*/
		Iterator<Constomer>itr=l.iterator();
		
		while(itr.hasNext())
		{
			Constomer o=itr.next();
			System.out.println(o);
		}
		
		
	}
	public void showMinAge()
	{
		Iterator<Constomer> c=l.iterator();
		Constomer ob=l.get(0);
		int min=ob.cAge;
		System.out.println(min);
		while(c.hasNext()) 
		{
			Constomer o=c.next();
			if(min>o.cAge)
			{
				ob=o;
			}
			
		}
		System.out.println("Minimum Age:"+ob);
	}
	public void showMaxAge()
	{
		Iterator<Constomer> c=l.iterator();
		Constomer ob=l.get(0);
		int max=ob.cAge;
		System.out.println(max);
		while(c.hasNext()) 
		{
			Constomer o=c.next();
			if(max<o.cAge)
			{
				ob=o;
			}
			
		}
		System.out.println("Maximum Age:"+ob);
	}

	public static void main(String[] args) {
		ConstomerIterator obj=new ConstomerIterator();
		obj.prepareConstomerList();
		obj.showConstomerList();
		//obj.showMinAge();
		//obj.showMaxAge();
		//obj.changeAge();
		obj.showConsumer();
		obj.showSort();
		
		

	}

}
