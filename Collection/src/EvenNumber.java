import java.util.ArrayList;

public class EvenNumber {
	public void evenNumber()
	{
		ArrayList<Integer> l=new ArrayList<>();
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				l.add(i);
			}
		}
		System.out.println(l);
	}

	public static void main(String[] args) {
		EvenNumber e=new EvenNumber();
		
		e.evenNumber();

	}

}
