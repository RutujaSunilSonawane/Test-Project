
public class FactorialReExample
{
	int calFac(int num)
	{
		if(num==0)
			return 1;
		else
			return(num*calFac(num-1));
	}

	public static void main(String[] args)
	{
		FactorialReExample fact=new FactorialReExample();
		System.out.println("Factorial:"+fact.calFac(6));

	}

}
