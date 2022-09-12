import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a java program to input any alphabet and check whether it is vowel or consonant.//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any char");
		char ch=(sc.nextLine().charAt(0));
		switch(ch)
		{
		case 'a':
		{
			System.out.println("Vowel");
			break;
		}
		case 'e':
		{
			System.out.println("Vowel");
			break;
		}
		case 'i':
		{
			System.out.println("Vowel");
			break;
		}
		case 'o':
		{
			System.out.println("Vowel");
			break;
		}
		case 'u':
		{
			System.out.println("Vowel");
			break;
		}
		default:
		{
			System.out.println("Consonant");
			break;
		}
		}
		

	}

}
