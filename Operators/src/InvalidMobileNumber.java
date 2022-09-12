import java.util.regex.Pattern;

public class InvalidMobileNumber
{
	public static boolean validMobileNumber(String str)
	{
		Pattern p=Pattern.compile("(0/91)?[7-9][0-9]{9}");
		//Macher match=p.matcher(str);
		//return (match.find()&& match.group().equal(str));
		return true ;
	}
	public static void main(String[] args) {
		String str="8530010723";
		if(validMobileNumber(str))
		{
		System.out.println("valid mobile number");
		}
		else
		{
			System.out.println("Invalid mobile number");
		}

	}

}
