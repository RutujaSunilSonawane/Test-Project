
public class Item
{
	int id;
	String name;
	int cost;
	String supplyer;
	
	public void acceptItemDetail(int id,String s,int c,String n)
	{
		id=id;
		name="s";
		cost=c;
		supplyer=n;
	}
	public void showDetail()
	{
		System.out.println("ItemId"+id);
		System.out.println("ItemName"+"s");
		System.out.println("cost of item"+cost);
		System.out.println("supplyer name"+"n");
		
	}
	public static void main(String[]args)
	{
		Item i=new Item();
		i.id=23;
		i.name="tq";
		i.cost=1200;
		i.supplyer="Rutuja";
		
		
		i.acceptItemDetail(23,"tq",1200,"Rutuja");
		i.showDetail();
		
	}
	

}
