import java.util.HashMap;
public class OccuranceOfCharacter 
{
	public void display()
	{
		String str="abcdefghtabcfqierhfwmkdn";
		HashMap<Character,Integer>s=new HashMap<>();
		for(int i=str.length()-1;i>=0;i--)
		{
			if(s.containsKey(str.charAt(i)))
			{
				int cnt=s.get(str.charAt(i));
				s.put(str.charAt(i), ++cnt);
			}
			else
				s.put(str.charAt(i), 1);
		}	
	
	System.out.println(s);
	}

	public static void main(String[] args) {
		
		OccuranceOfCharacter obj=new OccuranceOfCharacter();
		obj.display();
	}

}
