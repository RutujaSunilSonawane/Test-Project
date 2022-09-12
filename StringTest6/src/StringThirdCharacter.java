import java.util.Scanner;

public class StringThirdCharacter {
	public void thirdChracter(String str)
	{
		
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int a=ch[i]+3;
			System.out.print((char)a);
			
		}
		
	}

	public static void main(String[] args) {
		
		StringThirdCharacter st=new StringThirdCharacter();
		st.thirdChracter("sfh");
		

	}

}
