
public class StringThirdCharacter 
{
	public void display(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int a=ch[i]+3;
			System.out.println((char)a);
			
		}
	}
	

	public static void main(String[] args) {
		
		StringThirdCharacter obj=new StringThirdCharacter ();
		obj.display("abc");
	}

}
