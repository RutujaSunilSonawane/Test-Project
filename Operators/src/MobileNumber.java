import java.util.Scanner;
import java.util.regex.Pattern;

class InvalidNumberException extends Exception
{
	public String getMessage()
	{
		return "Mobile number not a proper format";
	}
}
public class MobileNumber {
	public void validNumber() throws InvalidNumberException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mobile number");
		int num=sc.nextInt();
		if(num.matches("[0-9]{10}")) {
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
