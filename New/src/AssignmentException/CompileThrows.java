package AssignmentException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CompileThrows
{
	public void readFile() throws FileNotFoundException
	{
		FileInputStream foe=new FileInputStream("d:/abc.text");
				
	}
	public void saveFile() throws FileNotFoundException
	{
		FileOutputStream fis=new FileOutputStream("d:/xyz.tesxt");
	}

	public static void main(String[] args) {
		CompileThrows obj=new CompileThrows();
		try {
		obj.readFile();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		try
		{
			obj.saveFile();
		}
		catch(FileNotFoundException e1)
		{
			System.out.println(e1);
		}
				

	}

}
