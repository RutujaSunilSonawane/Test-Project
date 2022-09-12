class Animal
{
	Animal()
	{
		System.out.println("Animal class created");
	}
}
class Dog extends Animal
{
	Dog()
	{
		super();
		System.out.println("Dog class Created");
	}
}
public class SuperParentConstructor {

	public static void main(String[] args)
	{
		Dog d=new Dog();
		

	}

}
