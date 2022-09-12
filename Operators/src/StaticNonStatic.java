
public class StaticNonStatic {
	static int sum(int a,int b)
	{
		System.out.println(a+b);
		return b;
	}
	public void sum1(int a,int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
	
		
		StaticNonStatic s=new StaticNonStatic();
		s.sum1(3, 4);
		StaticNonStatic.sum(1,5);
	}

}
