
public class MethodOverloading 
{
	int sid,m1,m2;
	String name;
	
	public void display(int sid,String name)
	{
		this.sid=sid;
		this.name=name;
	}
	public void display(int  m1,int m2)
	{
		this.m1=m1;
		this.m2=m2;
	}
	public void showDetails()
	{
		System.out.println(sid);
		System.out.println(name);
		System.out.println(m1);
		System.out.println(m2);
	}
	

	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.display(12, "Rutuja");
		m.display(78, 89);
		m.showDetails();

	}

}
