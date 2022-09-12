package Abstraction;

abstract class Food
{
	abstract void preparedFood();
	abstract void ingredFood();
	public void parsalFood(String s)
	{
		System.out.println("Parsal of Food is :"+s);
	}
}
class Roti extends Food
{
	public void preparedFood()
	{
		System.out.println("Prepared Roti");
	}
	public void ingredFood()
	{
		System.out.println("IngredFood is :Water,Wheat flour,salt");
	}
}
class Paratha extends Food
{
	public void preparedFood()
	{
		System.out.println("Prepared Paratha");
	}
	public void ingredFood()
	{
		System.out.println("IngredFood is :Water,Wheat flour,salt,chilli,onion");
	}
}
public class Hotel {

	public static void main(String[] args) {
		Food f=new Roti();
		f.preparedFood();
		f.ingredFood();
		Food f1=new Paratha();
		f1.preparedFood();
		f1.ingredFood();

	}

}
