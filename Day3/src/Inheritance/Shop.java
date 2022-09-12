package Inheritance;

class Fruits
{
	String colour;
	String teasty;
	
	public void eat()
	{
		System.out.println("Enjoy eating fruts");
	}
	public void purches()
	{
		System.out.println("purchasing fruits");
	}
}
class DryFruit extends Fruits
{
	String grade;
	float wholeSaleRate;
	
	public void importFruit()
	{
		System.out.println("Importing fruits from other place");
	}
	public void export()
	{
		System.out.println("Exporting fruits to uk");
	}
}

public class Shop {

	public static void main(String[] args) {
		DryFruit df=new DryFruit();
		
		df.eat();
		df.purches();
		df.export();
		df.importFruit();
		
		

	}

}
