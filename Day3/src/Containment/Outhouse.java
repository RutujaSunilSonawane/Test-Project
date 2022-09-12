package Containment;

public class Outhouse
{
	private int oNo;
	private float oArea;
	private Banglo bObj;
	
	public void setONo(int n)
	{
		oNo=n;
	}
	public int getONo()
	{
		return oNo;
	}
	public void setOArea(float a)
	{
		oArea=a;
	}
	public float getOArea()
	{
		return oArea;
	}
	public void setBObj(Banglo b)
	{
		bObj=b;
	}
	public Banglo getBObj()
	{
		return bObj;
	}
	
	//Outhouse(int n,float a)
	//{
	//	oNo=n;
	//	oArea=a;
		
	//}
	public String toString()
	{
		return oNo+" "+oArea;
	}

}
