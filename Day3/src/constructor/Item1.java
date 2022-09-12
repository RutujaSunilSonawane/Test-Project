package constructor;

public class Item1 
{
	int id,cost;
	String name,supplier;
	
	Item1()          //Default Constructor
	{
		id=100;
		cost=500;
		name="Rutuja";
	}
	Item1(int ids,int cst,String n)			//Paramized constructor
	{
		id=ids;
		cost=cst;
		name=n;
	}
	/*public void acceptDetails(int ids,int cst,String n)
	{
		id=ids;
		cost=cst;
		name=n;
	}*/
	public void showDetails()
	{
		System.out.println("Item ids:"+id);
		System.out.println("Item cost:"+cost);
		System.out.println("Item name:"+name);
		
	}
	
	public static void main(String[] args)
	{
		Item1 i=new Item1();
		//System.out.println("i object created & value initilized in that object");
		i.showDetails();
		//i.acceptDetails(100, 500, "Rutuja");
		
		
		/*Item1 i1=new Item1();
		System.out.println("i1 object created & value initilized in that object");
		i1.showDetails();
		//i1.acceptDetails(101, 1000, "Nilhil");*/
		



	}

}
