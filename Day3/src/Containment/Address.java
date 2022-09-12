package Containment;

public class Address
{
	int serno,pin;
	String socity,city;
	
	Address(int sn,int p,String so,String c)
	{
		serno=sn;
		
		pin=p;
		socity=so;
		city=c;
	}
	public String toString()
	{
		return serno+" "+pin+" "+socity+" "+city;
	}

}
