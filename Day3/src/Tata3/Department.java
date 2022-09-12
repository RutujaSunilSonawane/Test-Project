package Tata3;

public class Department
{
	
		int depId;
		String depName;
		
		Department(int dId,String n)
		{
			depId=dId;
			
			depName=n;
		}
		public void display()
		{
			System.out.println("depId:"+depId);
			System.out.println("depName:"+depName);
			System.out.println();
		}
	

}
