
public class Vehicle
{
	public void move()
	{
		System.out.println("Vehicle is moving");
	}

}
class Car extends Vehicle
{
	public void move()
	{
		super.move();
		System.out.println("Car is moving");
	}
}
class Helicopter extends Vehicle
{
	public void move()
	{
		System.out.println("Helocopter is moving");
	}
}

