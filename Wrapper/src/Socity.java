
public class Socity
{
	int sId;
	String sName;
	Socity(){
		
	}
	Socity(int i,String n)
	{
		sId=i;
		sName=n;
	}
	public  void showDetails()
	{
		System.out.println(sId);
		System.out.println(sName);
	}
	//public void enjoyEvent()
	//{
		//ClubHouse c=new ClubHouse()
	//	new ClubHouse()
				{
		//	public void coductGames()
			//{
			//	System.out.println("Successfully conducted games");
			//}

		//	@Override
			//public void coductGamas() {
				// TODO Auto-generated method stub
				//return;
		//	}

				//}.coductGamas();
				
	//}
	static class Audit
	{
		String aName;
		int date;
		Audit()
		{
			
		}
		Audit(int d,String n)
		{
			date=d;
			aName=n;
		}
		public void doAudit()
		{
		//	showDetails();
			System.out.println("Audit date:"+date+"Audit name: "+aName);
		}
	}
	class Flat
	{
		int fId;
		String fOwnerName;
		Flat(){
			
		}
		
		
		Flat(int i,String n)
		{
			fId=i;
			fOwnerName=n;
		}
		public void showFlatDetails()
		{
			showDetails();
			System.out.println(fId);
			System.out.println(fOwnerName);
		}
	}
	public static void main(String[] args)
	{
		Flat f=new Socity(123,"xyz").new Flat(101,"abc");
		f.showFlatDetails();
		Audit a=new Audit(11-11-2022,"pqr");
		a.doAudit();
		//Socity s=new Socity();
		//s.enjoyEvent();
	}

}
