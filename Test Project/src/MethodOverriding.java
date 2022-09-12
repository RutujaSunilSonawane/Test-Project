class Banking
{
	public void doTransation()
	{
		System.out.println("Transation is done!");
	}
}
class OnlineBanking extends Banking
{
	public void doTransation()
	{
		//super.doTransation();
		System.out.println("Transation done is online");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlineBanking b=new OnlineBanking();
		b.doTransation();
	}

}
