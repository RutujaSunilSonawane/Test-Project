
public class PrimeNumber1to50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print the prime number 1 to 50//
		int i=0;
		int n=0;
		String primeNumber="";
		for(i=1;i<=50;i++)
		{
			int counter=0;
			for(n=i;n>=1;n--)
			{
				if(i%n==0)
					counter=counter+1;
				
			}
			if(counter==2)
			{
				primeNumber=primeNumber+i+"   ";
			}
			
		}
		System.out.println(primeNumber);

	}

}
