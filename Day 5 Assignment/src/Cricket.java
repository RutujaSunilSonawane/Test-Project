class IPLTeam
{
	public void play()
	{
		System.out.println("This is IPL Match");
	}
}
class CSK extends IPLTeam
{
	public void play()
	{
		super.play();
		System.out.println("Team name is CSK ");
	}
}
class RCB extends IPLTeam
{
	public void play()
	{
		
		System.out.println("Team name is RBC");
	}
}
public class Cricket {

	public static void main(String[] args) 
	{
		IPLTeam tm=new CSK();
		tm.play();
		tm=new RCB();
		tm.play();
		
		

	}

}
