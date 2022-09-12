
public class Employee 
{
	private int id;
	private String name;
	private float salary;
	private Dept dObj;
	private Mydate mdObj;
	
	public void setId(int i)
	{
		id=i;
	}
    public int getId()
    {
    	return id;
    }
    public void setName(String n)
    {
    	name=n;
    }
    public String getName()
    {
    	return name;
    }
    public void setSalary(float s)
    {
    	salary=s;
    }
    public float getSalary()
    {
    	return salary;
    }
    public void setDObj(Dept d)
    {
    	dObj=d;
    }
    public Dept getDObj()
    {
    	return dObj;
    }
    public void setMDObj(Mydate m)
    {
    	mdObj=m;
    }
    public Mydate getMDObj()
    {
    	return mdObj;
    }
    /*Employee(int i,String n,float s,Dept d,Mydate md)
      {
         id=i;
        name=n;
        salary=s;
         dObj=d;
         mdObj=md;
        }*/
    public String toString()
    {
    	return id+" "+name+" "+salary+" "+dObj+" "+mdObj;
    }
        
     
}
