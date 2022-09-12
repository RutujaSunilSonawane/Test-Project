import java.util.Scanner;

public class LowercaseToUppercase
{
	public void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String name=sc.next();
		System.out.println(name.toLowerCase());//small letter
		System.out.println(name.toUpperCase());//capital world
		
	}

	public static void main(String[] args)
	{
		LowercaseToUppercase obj=new LowercaseToUppercase();
		obj.display();
		

	}

}
