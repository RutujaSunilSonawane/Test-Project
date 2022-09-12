package Encapsulation;

public class Item
{

	private String name,supplyer;
	private int cost;
	public int id=1;
	
	public void setCost(int cst)
	{
		cost=cst;
	}
	
	public int getCost()
	{
		return cost;
	}
	public void setId(int ids)
	{
		id=ids;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String nm)
	{
		name=nm;
	}
	public String getName()
	{
		return name;
	}
	public void setSupplyer(String s)
	{
		supplyer=s;
	}
	public String getSupplyer()
	{
		return supplyer;
	}
	public static void main(String[]args)
	{
		Item i=new Item();
		i.setCost(35);
		i.setId(2);
		i.setName("rutuja");
		i.setSupplyer("tq");
		System.out.println("cost::"+i.getCost());
		System.out.println("ID::"+i.getId());
		System.out.println("Name::"+i.getName());
		System.out.println("Supplyer::"+i.getSupplyer());
	}
}
