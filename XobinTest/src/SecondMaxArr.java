import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SecondMaxArr {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input_from_question=br.readLine();
		String str[]=input_from_question.split(" ");
		int arr[]=new int[str.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(str[i]);
			
		}
		input_from_question="";
		Arrays.sort(arr);
		int max=arr.length-1;
		int sMax=arr.length-2;
		input_from_question=arr[sMax]+" "+arr[max];
		System.out.println(input_from_question);
	}

}
