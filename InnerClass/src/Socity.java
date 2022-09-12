
public class Socity
{
	static int sId;
	static String sName;
	
	Socity()
	{
		
	}
	Socity(int i,String n)
	{
		 sId=i;
		sName=n;
	}
	public static void showSocityDetails()
	{
		System.out.println("Socity id:"+sId+" Socity Name:"+sName);
	}
	class Flat
	{
		int fNo;
		String fOnerName;
		
		Flat()
		{
			
		}
		Flat(int i,String n)
		{
			fNo=i;
			fOnerName=n;
			
		}
		public void showFlatInformation()
		{
			showSocityDetails();
			System.out.println("Flat no:"+fNo+"  Flat oner name:"+fOnerName);
		}
	}
		static class Audit
		{
			String aName,aDate;
			
			Audit()
			{
				
			}
			Audit(String n,String d)
			{
				aName=n;
				aDate=d;
			}
			public void doAudit()
			{
				showSocityDetails();
				System.out.println("Audit name:"+aName+" Audit date:"+aDate);
			}
		}
		public void PlayGames()
		{
			//ClubHouse a=new ClubHouse()
			new ClubHouse()
			
			{

						@Override
						public void coductGame() {
							// TODO Auto-generated method stub
							System.out.println("Games Conducted");
							
						}
					}.coductGame();
			//a.coductGame();
		}
		public void PerformTask()
		{
			new Decorate()
			{
				

				@Override
				public void makeDecoration() {
					
					System.out.println("Decoration ready...");
				}
			}.makeDecoration();
		}
	
	public static void main(String[] args)
	{
		Flat f=new Socity(1234,"ABC").new Flat(101,"XYZ");
		f.showFlatInformation();
		Audit a=new Audit("Nashik","11-Nov-2022");
		a.doAudit();
		Socity s=new Socity();
		s.PlayGames();
		Socity s1=new Socity();
		s1.PerformTask();
		
	
	}

}
