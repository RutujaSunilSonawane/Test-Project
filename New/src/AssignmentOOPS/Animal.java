package AssignmentOOPS;
class Dog
{
	public void fly()
	{
		System.out.println("I am flying");
	}
}
public class Animal {
	public void eat()
	{
		System.out.println("I am eatting");
		}
	public void run()
	{
		System.out.println("I am running");
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello");
		Animal obj=new Animal();
		obj.eat();
		obj.run();
		Dog o= new Dog();
		o.fly();
		
	}

}
