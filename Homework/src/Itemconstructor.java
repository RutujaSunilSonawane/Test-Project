
public class Itemconstructor 
{
	int id,cost;
	String Name,Supplier;
	
	Itemconstructor()
	{
		id=100;
		cost=500;
		Name="Nikhil";
		Supplier="TQ";
		
	}
	Itemconstructor(int i,int c,String n,String s)
	{
		id=i;
		cost=c;
		Name=n;
		Supplier=s;
		
	}
	public void acceptDetails(int i,int c,String n,String s)
	{
		id=i;
		cost=c;
		Name=n;
		Supplier=s;
	}
	public  void showDetails()
	{
		System.out.println("Itemconstructor id:"+id);
		System.out.println("Itemconstructor cost:"+cost);
		System.out.println("Itemconstructor Name:"+"Name");
		System.out.println("Itemconstructor Supplier:"+"Supplier");
	}
}