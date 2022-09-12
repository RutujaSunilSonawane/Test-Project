
public class Student
{
	int roll,m1,m2;
	String Name;
	public void acceptDetails(int r,int ma1,int ma2,String n)
	{
		roll=r;
		m1=ma1;
		m2=ma2;
		Name=n;
	}
	public void showDetails()
	{
		System.out.println("Roll:"+roll+"Mark1:"+m1+"mark2"+m2);
		System.out.println("Name:"+Name);
	}
	
	
	
	
}
