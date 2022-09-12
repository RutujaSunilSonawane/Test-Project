	
public class School
{

	private static char[] hashcode;
	int roll,m1,m2;
	String name,grade;
	public void acceptDetails(int r,int mark1,int mark2,String n,String g)
	{
		roll=r;
		m1=mark1;
		m2=mark2;
		name=n;
		grade=g;
	}
	public String toString()
	{
		String str="roll:"+roll+"marks1:"+m1+"maeks2:"+m2+"Name:"+name+"grade:"+grade;
		return str;
	}
	public void showRecord()
	{
		System.out.println("Roll"+roll+"M1::"+m1+"M2::"+m2);
		System.out.println("Name::"+name+"Pass with"+grade);
	}
	
	
	
		
	
	public static void main (String[] args)
	{
		School s=new School();
		School s1=new School();
		School s2=new School();
		s2=s1;
		
		s.acceptDetails(12, 78, 85, "Rutuja", "A");
		s1.roll=s.roll;
		s1.m1=s.m1;
		s1.m2=s.m2;
		s1.name=s.name;
		s1.grade=s.grade;
		s1.showRecord();
		s2.showRecord();
		s.showRecord();
		System.out.println(+s.hashCode());
		System.out.println(+s1.hashCode());
		System.out.println(+s2.hashCode());
	}
	
		
	
}
