
abstract class Food
{
	abstract void preparedFood();
	abstract void ingredFood();
	public void parsalFood(String s)
	{
		System.out.println("Parsal of food is:"+s);
	}
}
 class Roti extends Food
{
	public void preparedFood() {
		System.out.println("Prepared roti");
		parsalFood("Roti");
	}
	public void ingredFood()
	{
		System.out.println("IngredFood:water,wheat flour,salt");
	}
}
abstract class Paratha extends Food
{
	public void preparedFood() {
		System.out.println("Prepared paratha");
		parsalFood("paratha");
	}
	public void ingredFood()
	{
		System.out.println("IngredFood:water,wheat flour,salt,chilli,onion");
	}
}
class AluParatha extends Paratha
{
	public void preparedFood() {
		System.out.println("Prepared Aluparatha");
		parsalFood("Aluparatha");
	}
	public void ingredFood()
	{
		System.out.println("IngredFood:water,wheat flour,salt,chilli,onion,alu");
	}
}
public class Hotel {

	public static void main(String[] args) {
	   Food f=new Roti();
	   f.preparedFood();
	   f.ingredFood();
	  // Food f1=new Paratha();
	  // f1.preparedFood();
	  //f1.ingredFood();
	   Food f1=new AluParatha();
	   f1.preparedFood();
	   f1.ingredFood();
	   

	}

}
