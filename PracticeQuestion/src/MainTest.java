import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.Reader;

public class MainTest {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input_from_question=br.readLine();
		int num=Integer.parseInt(input_from_question);
		String outp="";
		int fact=1;
		int count=1;
		while(true)
		{
			fact=fact*count;
			if(fact>num)
			{
				break;
			}
			outp=outp+fact+" ";
			count++;
		}
		System.out.println(outp);

	}

	

}
