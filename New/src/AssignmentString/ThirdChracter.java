package AssignmentString;

public class ThirdChracter
{
	public void thirdchar(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int a=ch[i]+3;
			System.out.println((char)a);
		}
	}

	public static void main(String[] args) {
		ThirdChracter obj=new ThirdChracter();
		obj.thirdchar("rut");

	}

}
