
public class Mydate
{
	private int year;
	private String day,month;
	
	public void setYear(int y)
	{
		year=y;
	}
	public int getYear()
	{
		return year;
	}
	public void setDay(String d)
	{
		day=d;
	}
	public String getDay()
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
    /*Mydate(int y,String d,String m)
      {
        year=y;
        day=d;
       month=m;
        }*/
    public String toString()
    {
    	return year+" "+day+" "+month;
    }
    
}
