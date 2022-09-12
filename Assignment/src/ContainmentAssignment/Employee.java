package ContainmentAssignment;

public class Employee
{
	int eId;
	String name;
	double salary;
	Dept dObj;
	Mydate mObj;
	
	Employee(int i,String n,double s,Dept d,Mydate m)
	{
		eId=i;
		name=n;
		salary=s;
		dObj=d;
		mObj=m;
	}
	public String toString()
	{
		return eId+" "+name+" "+salary+" "+dObj+" "+mObj;
	}

}
