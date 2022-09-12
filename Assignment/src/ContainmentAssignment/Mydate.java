package ContainmentAssignment;

public class Mydate
{
	String day,month;
	int year;
	
	
	Mydate(int y,String d,String m)
	{
		year=y;
		day=d;
		month=m;
		
	}
	public String toString()
	{
		return year+" "+day+" "+month;
	}

}
