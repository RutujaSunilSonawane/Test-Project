import java.util.Scanner;
class AgeNotApplicableException extends RuntimeException
{
	public String getMessage()
	{
		return "Age is not applicable for vaccine";
	}
}
public class Person {
	int age,aadharNo;
	String name;
	
	Person(int a,int n,String nm)
	{
		age=a;
		aadharNo=n;
		name=nm;
	}
	public void checkEligibilityForVaccine()
	{
		if(age>60)
		{
			System.out.println("Applicable boosted vaccine");
		}
		else
		{
			System.out.println("not applicable");
		}
	}
	public String toString()
	{
		return "Age:"+age+"  Aadhar no:"+aadharNo+"   Person Name:"+name;
	}

	public static void main(String[] args) 
	{
		Person p=new Person(22,12345,"Rutuja");
		try
		{
			p.checkEligibilityForVaccine();
		}
		catch(AgeNotApplicableException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println(p);
	}

}
