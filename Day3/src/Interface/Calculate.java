package Interface;

public interface Calculate 
{
	int add(int x,int y);
	void mul(int x,int y);

}
interface SciCal
{
	void div(int x,int y);
	void sub(int a,int b);
}
interface Bill extends Calculate,SciCal
{
	void bill(int a,int b);
	
}
class Shop implements Bill
{
	public int add(int x,int y)
	{
		return x+y;
	}
	public void mul(int x,int y)
	{
		System.out.println("The multiplication of and b is :"+(x*y));
	}
	public void div(int x,int y)
	{
		System.out.println("The Division of a and b is: "+(x/y));
	}
	public void sub(int a,int b)
	{
		System.out.println("The substraction of a and b is:"+(a - b));
	}
	public void bill(int a,int b)
	{
		int result=a+b;
		System.out.println("The bill is:"+result);
	}
}
