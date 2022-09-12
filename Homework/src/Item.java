
public class Item
{
	int id,cost;
	String Name,Supplier;
	public void acceptDetails(int ids,int cst,String n,String s)
	{
		id=ids;
		cost=cst;
		Name=n;
		Supplier=s;
	}
	public void showDetails()
	{
		System.out.println("ids:"+id+"cost:"+cost);
		System.out.println("Name:"+Name+"Supplier:"+Supplier);
	}
}
