package Interface;
class Magzine extends Book implements Edit
{
	Magzine(int i,int c,String b,String a)
	{
		super(i,c,b,a);
	}
	public void read()
	{
		System.out.println("Magzine is the reading");
	}
	public void update()
	{
		System.out.println("Magzine the update");
	}
	public void write()
	{
		System.out.println("Magzine the writting");
	}
	
}

/*public class Magzine implements Edit
{
	public void read()
	{
		System.out.println("Magzine is the reading");
	}
	public void update()
	{
		System.out.println("Magzine the update");
	}
	public void write()
	{
		System.out.println("Magzine the writting");
	}
	
}*/


class NewsPaper implements Edit
{
	public void read()
	{
		System.out.println("NewsPaper the reading");
	}
	public void update()
	{
		System.out.println("NewsPaper the update");
		write();
	}
	/*public void write()
	{
		System.out.println("NewsPaper the writting");
	}*/
}
