package ArrayAssignment;

public class CharacterArray
{
	public void changeChar(char ch[])
	{
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=(char) (ch[i]+3);
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+",");
		}
	}

	public static void main(String[] args) {
		char ch[]= {'a','n','K','E','g'};
		CharacterArray obj=new CharacterArray();
		obj.changeChar(ch);
				
		}

	}


