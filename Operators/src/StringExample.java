
public class StringExample {

	public static void main(String[] args) {
		String str=new String("Good Morning");
		System.out.println(str);
		//1.length method
		int name=str.length();
		System.out.println(name);
		//2.toLowerCase
		String s=str.toLowerCase();
		System.out.println(s);
		//3. toUpperCase
		String s1=str.toUpperCase();
		System.out.println(s1);
		//4 trim method
		String s2="       Good Morning";
		System.out.println(s2);
		String s3=s2.trim();
		System.out.println(s3);
		System.out.println(str.substring(3));
		System.out.println(str.substring(2,7));

	}

}
