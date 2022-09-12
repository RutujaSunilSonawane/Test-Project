import java.util.Scanner;

public class StringLength 
{
	public void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String name=sc.next();
		int length=name.length();
		System.out.println("The length of String name is length:"+length);
		
		
	}
	public static void main(String[] args)
	{
		StringLength obj=new StringLength();
		obj.display();

	}

}
