import java.io.PrintStream;
import java.lang.reflect.Array;

public class Item 
{
	
	int id;
	String Name;
	int cost,qty;
	String Supplier;
	public static float gst=0.18f;
	float bill,billl;

	

	
	
	
	Item()
	{
		System.out.println("I am in default constructor");
		id=12;
		Name="abc";
		cost=56;
		Supplier="tq";
		qty=4;
		
	}
	Item(int ids,String n,int cst,String s,int quatity)
	{
		System.out.println("I am in Parameterized Constructor");
		ids=id;
		n=Name;
		cst=cost;
		s=Supplier;
		qty=quatity;
	}
	public String toString()
	{
		String str="Id:"+id+"name"+Name+"cst:"+cost+"quantity"+qty;
		return str;
		
	}
	
	public void showItems(Item arr[])
	{
		for(Item x:arr)
		{
			System.out.println(x);
			System.out.println("------------");
		}
	}
	public void accept(Item[]i) {
		i[0]=new Item(101,"Rutuja", 34,"tq",500);
		i[1]=new Item(101,"Rutuja", 34,"tq",500);
		i[2]=new Item(101,"Rutuja", 34,"tq",500);
		
	}
	public void bill() {
		Item.changeGST();
		bill=(cost*qty)*gst;
		billl=bill*(billl*gst);
	}
	public static void changeGST()
	{
		gst=0.18f;
	}

	
	 void acceptItemDetail(int id,String s,int c,String n)
	{
		this.id=id;
		Name=s;
		cost=c;
		Supplier=n;
	}
	
	void showDetail()
	{
		System.out.println("ItemId" +id);
		System.out.println("ItemName" +Name);
	
		System.out.println("cost of Item"+cost);
		System.out.println("Supplier name "+Supplier);
		System.out.println("Bill:"+bill);
		System.out.println("GST"+billl);
	}

	
	public static void main(String[]ags)
	{
		Item i=new Item();
		
		
		i.id=23;
		i.Name="tq";
		i.cost=1200;
		i.Supplier="Rutuja";
		
		i.acceptItemDetail(23," tq", 1200," Rutuja");
	
		i.showDetail();
	
		
		
		
	
	

	}
	
}