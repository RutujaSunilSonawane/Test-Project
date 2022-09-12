
public class StudentMethodCall
{
	int sid,m1,m2;
	String sName;
	public void display(int a,String n)
	{
		sid=a;
		sName=n;
	}
	public void display(int m1,int m2)
	{
		this.m1=m1;
		this.m2=m2;
	}
	public void accepDetails()
	{
		System.out.println(sid);
		System.out.println(sName);
		System.out.println(m1);
		System.out.println(m2);
		
	}
	
	public static void main(String[] args)
	{
		StudentMethodCall obj=new StudentMethodCall();
		obj.display(12, "Rutuja");
		obj.display(89, 90);
		obj.accepDetails();
		
	}

}
