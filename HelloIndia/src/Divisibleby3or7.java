
public class Divisibleby3or7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++)
		{
			if(i%3==0 && i%7==0)
			{
				System.out.println(i/3);
				System.out.println(i/7);
				
			}
			else if(i%3==0)
			{
				System.out.println(i/3);
				
			}
			else if(i%7==0)
			{
				System.out.println(i/7);
			}
			else
			{
				System.out.println(i);
			}
		}

	}

}
