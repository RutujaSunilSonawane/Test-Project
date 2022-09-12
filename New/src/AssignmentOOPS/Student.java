package AssignmentOOPS;

public class Student 
{
	private int sid , marks;
	private String sName ;
	public void setSid(int i)
	{
		sid=i;
	}
	public int getSid()
	{
		return sid;
	}
	public void setMarks(int m)
	{
		marks=m;
	}
	public int getMarks()
	{
		return marks;
	}
	public void setSName(String n)
	{
		sName=n;
	}
	public String getSName()
	{
		return sName;
	}
	
	

	public static void main(String[] args) {
		Student s=new Student();
		s.setSid(11);
		s.setMarks(96);
		s.setSName("Nikhil");
		System.out.println(s.getSid());
		System.out.println(s.getMarks());
		System.out.println(s.getSName());
		

	}

}
