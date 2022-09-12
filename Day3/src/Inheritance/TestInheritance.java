package Inheritance;

class Animal
{
	public void eat()
	{
		System.out.println("Eatting");
	}
}

class Dog extends Animal
{
	public void bark()
	{
		System.out.println("barking");
	}
}

public class TestInheritance {

	public static void main(String[] args)
	{
		Dog d=new Dog();
		d.eat();
		d.bark();
	
	}

}
