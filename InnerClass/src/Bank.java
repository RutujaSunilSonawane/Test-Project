
public class Bank
{
	String bName,ifscCode;
	Bank()
	{
		
	}
	Bank(String n,String i)
	{
		bName=n;
		ifscCode=i;
	}
	public void showBankDetails()
	{
		System.out.println("Bank name :"+bName);
		System.out.println("IFSCcode :"+ifscCode);
	}
	class Locker
	{
		int id;
		String lockerLocation;
		Locker()
		{
			
		}
		Locker(int i,String l)
		{
			id=i;
			lockerLocation=l;
		}
		public void lockerInformation()
		{
			showBankDetails();
			System.out.println("locker id:"+id+"  locker location:"+lockerLocation);
		}
	}
	public static void main(String[] args)
	{
		Locker l=new Bank("Bank of India","rutuja@135").new Locker(1234,"Sangamner");
		l.lockerInformation();
	}

}
