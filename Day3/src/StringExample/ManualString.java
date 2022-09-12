package StringExample;

public class ManualString {

	public static void main(String[] args) {
	String s1="Wel";
	String s2="Come";
	
	String emptystr=" ";
	for(int i=0;i<s1.length();i++)
	{
		emptystr+=s1.charAt(i);
	}
	for(int j=0;j<s2.length();j++)
	{
		emptystr+=s2.charAt(j);
	}
	
	System.out.println(emptystr);

	}

}
