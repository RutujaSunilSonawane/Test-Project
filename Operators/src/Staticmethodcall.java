
public class Staticmethodcall
{
	static int sum(int a,int b)
	{
		System.out.println(a+b);
		return b;
	}
	public void sum(double x,double y)
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		//System.out.println(Staticmethodcall.sum(3,5));
		
		Staticmethodcall s=new Staticmethodcall();
		s.sum(12.7, 34.6);
		Staticmethodcall.sum(2, 3);

	}

}
