
public class RecrrectionExample
{
	public int add(int n)
	{
		if(n!=0)
		{
			//System.out.println(n);
			return n+add(n-1);
		}
		else {
			//System.out.println(n);
			return n;
			
		}
			
	}
	
		

	public static void main(String[] args) {
		
		RecrrectionExample r=new RecrrectionExample();
		System.out.println(r.add(5));
		
	}

}
