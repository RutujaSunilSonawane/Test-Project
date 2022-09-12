package ContainmentAssignment;

public class Address 
{
	String city,state,country;
	
	Address(String c,String s,String co)
	{
		city=c;
		state=s;
		country=co;
	}
	public String toString()
	{
		return city+" "+state+" "+country;
	}

}
