
public class Joiningdate 
{
	private int year;
	private int day;
	private String month;
	
	public void setYear(int y)
	{
		year=y;
	}
	public int getYear()
	{
		return year;
	}
	public void setDay(int d)
	{
		day=d;
	}
	public int getDay()
	{
		return day;
	}
	public void setMonth(String m)
	{
		month=m;
	}
	public String getMonth()
	{
		return month;
	}
	/*Joiningdate(int y,int d,String m)
	  {
	    year=y;
	   day=d;
	  month=m;
	*/
	public String toString()
	{
		return year+" "+day+" "+month;
	}

}
