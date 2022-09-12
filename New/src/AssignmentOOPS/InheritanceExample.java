package AssignmentOOPS;
class Lion
{
	public void eat()
	{
		System.out.println("I am Eatting");
	}
}
class Cat extends Lion
{
	public void weak()
	{
		//super.eat();
		System.out.println("cat is weak");
	}
}
class BabyCat extends Cat
{
	public void bark()
	{
		System.out.println("Dog is barking");
	}
}
public class InheritanceExample {

	public static void main(String[] args) {
		BabyCat obj=new BabyCat();
		obj.eat();
		obj.weak();
		obj.bark();
		
		
		
		

	}

}
