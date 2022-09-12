
public class Person
{
	private int id;
	private String name;
	private Job joObj;
	
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
	public void setJOObj(Job j)
	{
		joObj=j;
	}
	public Job getJOObj()
	{
		return joObj;
	}
	/*Person(int i,String n,Job,j)
	  {
	    id=i;
	    name=n;
	    joObj=j;
	 */
	public String toString()
	{
		return id+" "+name+" "+joObj;
	}

}
