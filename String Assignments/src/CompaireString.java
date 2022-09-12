
public class CompaireString
{
	public void display()
	{
		//By using equals() methods
		String s1="Rutuja";
		String s2=" Kajal";
		String s3=new String("Rutuja");
		String s4="Ovi";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		//by using == operator
		System.out.println("Using the == operator");
		System.out.println(s1==s2);
		System.out.println(s1==s3);//false bez instance created non pool;
		System.out.println(s1==s4);
		//by compareTo() method
		System.out.println("compareTo method");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		
				
	}

	public static void main(String[] args)
	{ 
		CompaireString obj=new CompaireString();
		obj.display();
		

	}

}
