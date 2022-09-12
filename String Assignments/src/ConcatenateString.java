
public class ConcatenateString 
{
	public void display()
	{
		String s1="Rutuja";
		String s2="  Sonawane";
		String s3=s1.concat(s2);
		System.out.println(s3);
		String s="Rushi"+" Sonawane";
		System.out.println(s);
	}

	public static void main(String[] args) 
	{
		ConcatenateString obj=new ConcatenateString();
		obj.display();
		
	}

}
