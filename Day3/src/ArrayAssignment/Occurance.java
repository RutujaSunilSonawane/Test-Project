package ArrayAssignment;

public class Occurance
{
	public void occurance(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==999)
				continue;
			
			int cnt=1;
			for(int j =i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
					a[j]=-999;
				}
			}
			System.out.println(a[i]+"Appers "+cnt+"times/n");
		}
	}
	public static void main(String[] args)
	{
		
		
	}

}
