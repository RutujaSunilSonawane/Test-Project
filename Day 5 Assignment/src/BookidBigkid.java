

class Kid
{
	int id,cost;
	public void readBook(int i,int c)
	{
		id=i;
		cost=c;
		System.out.println("Kid 1 Variable:"+id);
		System.out.println("Kid 2 Variable:"+cost);
	}
	
}
class BigKid extends Kid

{
	String name;

	public void readBook(String n)
	{
		name=n;
		super.readBook(12, 500);
		
		System.out.println("BigKid k1 variable"+name);
	}
}
/*class Teenagar extends Kid
{
	public void readBook(int kTeenagar)
	{
		k2=kTeenagar;
		System.out.println("Teenagar k2 variable:"+k2);
	}
}*/
public class BookidBigkid {

	public static void main(String[] args)
	{
		BigKid bk=new BigKid();
		bk.readBook("Panipat");
		/*Kid k=new BigKid();
		k.readBook(123,5000);
		k=new Teenagar();*/
	

	}

}
