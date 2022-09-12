package ArrayAssignment;

public class StringReverse
{
	public void stringReverse(String str)
	{
		StringBuilder s=new StringBuilder(str);
		s.reverse();
		
	}

	public static void main(String[] args)
	{
		StringReverse r=new StringReverse();
		r.stringReverse("Rutuja");		
		
	}

}
