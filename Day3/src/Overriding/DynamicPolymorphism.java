package Overriding;

class Vehicle
{
	 int speed=150;
	public void move()
	{
		System.out.println("Vehicle is moving")	;
	}
}
class Car extends Vehicle
{
	int speed=200;
	public void move()
	{
		super.move();
		
		System.out.println("Car is moving Horizontally on Road");
	}
}
class Helicopter extends Vehicle
{
	public void move()
	{
		System.out.println("Helicopter is moving vertically up the sky");
		
	}
}

public class DynamicPolymorphism {

	public static void main(String[] args) 
	{
		Vehicle v=new Car();
		v.move();
		v=new Helicopter();
		v.move();

	}

}
