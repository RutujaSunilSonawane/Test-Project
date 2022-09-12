package StringExample;

public class Item
{
	int id,cost;
	String name;
	public Item(int i,int cst,String n)
	{
		id=i;
		cost=cst;
		name=n;
		
	}
	public String toString()
	{
		String str="ID:"+id+"cost:"+cost+"name:"+name;
		return str;
	}
	
	


}
