
public class Palidrome100to500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//all palindrome number from 100 to 500//
		
		int num;
		for(num=100;num<=500;num++)
		{
			int digit =0,sum=0;
			for(int i=num;i>0;i=i/10)
			{
				digit=i%10;
				sum=(sum*10)+digit;
				
			}
			if(num==sum)
			{
				System.out.println(num);
			}
			
		}

	}

}
