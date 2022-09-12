package AssignmentException;

import java.io.FileInputStream;

import javax.security.auth.login.AccountNotFoundException;

public class Compiletime 
{

	public static void main(String[] args) 
	{
		try
		{
		
		FileInputStream fs=new FileInputStream("d:/abc.text");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		

	}

}
