package AssignmentString;

public class Example {

	public static void main(String[] args) {
		String str=new String("Hello");
		System.out.println(str.length()	);
		String s=new String("Hello");
		//System.out.println(str==s);
		System.out.println(str.equals(s));
		str=str.concat(" Rutuja");
		System.out.println(str);

	}

}
