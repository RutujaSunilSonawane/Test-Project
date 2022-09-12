package Containment;

public class Banglo
{
	private String bName , oName;
	private int nRoom;
	 private Outhouse hObj;
	 

		public void setBName(String b)
		{
			bName=b;
		}
		public String getBName()
		{
			return bName;
		}
		public void setOName(String o)
		{
			oName=o;
		}
		public String getOName()
		{
			return oName;
		}
		public void setNRoom(int n)
		{
			nRoom=n;
		}
		public int getNRoom()
		{
			return nRoom;
		}
		public void setHObj(Outhouse h)
		{
			hObj=h;
		}
		public Outhouse getHObj()
		{
			return hObj;
		}
	Banglo()
	{
		
	}
	//Banglo(int n,String b,String o,Outhouse h)
	//{
	//	nRoom=n;
	//	bName=b;
	//	oName=o;
	//	hObj=h;
	//}
	public String toString()
	{
		return nRoom+" "+bName+" "+oName+" "+hObj;
	}
	

}
