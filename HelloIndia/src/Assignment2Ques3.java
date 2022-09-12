import java.util.Scanner;

public class Assignment2Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a java program to input any alphabet and check whether it is vowel or consonant// 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the char");
		char ch=(sc.nextLine().charAt(0));
		if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
		{
			System.out.println("This is Vowel");
		}
		else
		{
			System.out.println("This is Consonant");
		}
		sc.close();
	}

}
