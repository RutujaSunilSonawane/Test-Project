
public class Dept
{
	private int dept_id;
	 private String dept_name;
	 
	 
	 public void setDept_id(int i)
	 {
		 dept_id=i;
	 }
	 public int getDept_id()
	 {
		 return dept_id;
	 }
	 public void setDept_name(String n)
	 {
		 dept_name=n;
	 }
	public String getDept_name()
	{
		return dept_name;
	}
	/*Dept(int i,String n)
	  {
	     dept_id=i;
	     dept_name=n;
	   } */
	public String toString()
	{
		return dept_id+"  "+dept_name;
	}
	

}
