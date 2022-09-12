package AssignmentOOPS;

abstract public class Vehical
{
	abstract void start();
}
class Car extends Vehical
{
	void start()
	{
		System.out.println("car starting in key");
	}
}
class Scooty extends Vehical
{
	void start()
	{
		System.out.println("Scooty starting in kink");
	}

}