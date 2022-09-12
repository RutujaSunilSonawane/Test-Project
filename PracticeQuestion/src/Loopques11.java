
public class Loopques11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find the prime number between 300 to 400//
		int i=300;
		int n=300;
		String primeNumber ="";
		for(i=300;i<=400;i++)
		{
			int counter=0;
			for(n=i;n>=300;n--)
			{
				if(i%n==0)
					counter=counter+1;
				
			}
			if(counter==2)
				primeNumber=primeNumber+i+"";
			
		}
		System.out.println(primeNumber);
	}

}
