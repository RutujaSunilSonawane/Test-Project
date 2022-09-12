package Interface;

public class Person1 {
	int age;
	String name;
	Car c;
	public Person1()
	{
		
	}
	public Person1(int a,String n,Car c)
	{
		age=a;
		name=n;
		this.c=c;
	}
	public void PlanforVacation()
	{
		c.drive("BANGLORE", "GOA");
		System.out.println("My vacation is full of masti...");
	}

	public static void main(String[] args) {
		NonACCar Car=new NonACCar("BMW","BLACK");
		Person1 p=new Person1(22,"mr.X",Car);
		p.PlanforVacation();

	}

}
