package Overriding;

 class ElecDevice
{
	public  void doSale(int qty,float itemPrice)
	{
		System.out.println("Electric Device Quatity:"+qty+"Item Price:"+itemPrice);
	}
	
	public void doSale() {
		
		
	}
}
 class TV extends ElecDevice
{
	public  void doSale(int qty,float tvPrice)
	{
		super.doSale(qty,tvPrice);
		System.out.println("TV quatity:"+qty+"TV Price:"+tvPrice);
	}
}
 class Fridge extends ElecDevice
{
	public void doSale(int qty,float fPrice)
	{
		super.doSale( qty,fPrice);
		System.out.println("Fridge quatity:"+qty+"Fridge Price:"+fPrice);
	}
}

public class ElectricalDevicePoly {

	public static void main(String[] args) {
		ElecDevice ed=new TV();
		System.out.println("TV qty & price");
		ed.doSale(1,4000);
		ed=new Fridge();
		System.out.println("Fridge qty &price");
		ed.doSale(2, 5000);

	}

}
