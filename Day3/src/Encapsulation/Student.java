package Encapsulation;

public class Student 
{
		private String name;
		private int id;
		public void setName(String nm)
		{
			name=nm;
		}
		public String getName()
		{
			return name;
		}
		public void setId(int ids)
		{
			id=ids;
		}
		public int getId()
		{
			return id;
		}
	public static void main(String[] args)
	{
		Student s=new Student();
		s.setName("Rutuja");
		s.setId(234);
		
		
		System.out.println("name::::"+s.getName());
		System.out.println("Id:::"+s.getId());
	}
	

}
