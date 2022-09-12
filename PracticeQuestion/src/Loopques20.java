
public class Loopques20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print all palindrome numbers from 100 to 500//
		int num;
		for(num=100;num<=500;num++)
		{
			int digit=0,sum=0;
			for(int i=num;i>0;i=i/10)
			{
				digit=i%10;
				sum=(sum*10)+digit;
				
			}
			if(num==sum)
			{
				System.out.println("Palindrome number is:"+sum);
			}
		}
	}

}
