
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
 class Item implements Comparable<Item>{
	int id;String iName;float iCost;
	Item(){}
	Item(int id,String iName,float iCost)
	{
		this.id = id;
		this.iName = iName;
		this.iCost = iCost;
	}
	
	public String toString()
	{
		return id+" "+iName+" "+iCost;
	}
	
	public int compareTo(Item i)
	{
		if(this.iCost<i.iCost)
			return +1;
		else if(this.iCost>i.iCost)
			return -1;
		else
			return 0;
	}
	
	public boolean equals(Object obj) 
	{
        if(this == obj)
        {
        	return true;
        }
	   if(obj==null || this.getClass() != obj.getClass()) 
	   {
		return false;
	   }
	   Item i=(Item)obj;
	   return this.id==(i.id) && this.iName.equals(i.iName) && this.iCost==(i.iCost);
    }

}

public class ItemList {
	ArrayList<Item> l = new ArrayList<>();
	
	public void addEle()
	{
		l.add(new Item(101,"Pen",20.0f));
		l.add(new Item(103,"Pencil",20.5f));
		l.add(new Item(102,"Eraser",10.0f));
		l.add(new Item(103,"Pencil",20.5f));
		l.add(new Item(103,"Pencil",20.5f));
		l.add(new Item(102,"Eraser",10.0f));
		System.out.println(l);
	}
	
	public void showOccurence()
	{
		System.out.println();
		ListIterator<Item> litr = l.listIterator();

		for(int i=0;i<l.size();i++)
		{
			if(l.get(i)==null)
				continue;
			int cnt = 1;
			for(int j=i+1;j<l.size();j++)
			{
				if(l.get(i).equals(l.get(j)))
				{
					cnt++;
					l.set(j,null);
				}
			}
			System.out.println("The name "+l.get(i)+" Occures : "+cnt+" times");
		}
	}
	

	public static void main(String[] args) {
		ItemList obj = new ItemList();
		obj.addEle();
		obj.showOccurence();

	}

}
