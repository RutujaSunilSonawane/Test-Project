
public class FibbonacyReExample {
	public void fibbo(int a,int b,int range)
	{
		if(a<=range)
		{
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
			fibbo(a,b,range);
		}
	}

	public static void main(String[] args) {
		FibbonacyReExample f=new FibbonacyReExample();
		f.fibbo(0, 1, 25);

	}

}
