package StringExample;

public class Copy {
	String s1="Wel";
	String s2=s1;
	String s3=s1.concat(s2);
	public void showDetails()
	{
		System.out.println(s3);
	}
	
	public static void main(String[] args) {
		Copy c=new Copy();
		c.showDetails();
	

	}

}
