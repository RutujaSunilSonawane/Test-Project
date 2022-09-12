
public class WhiteSpace {

	public static void main(String[] args) {
		String str="I am learning java";
		String[] wrds=str.split(" ");
		String es="";
		int wsps=3; int cnt=1;
		for(String w:wrds)
		{
			es=es+w;
			if(cnt<wrds.length)
			for(int i=1;i<=wsps*cnt;i++)
				es+="_";
			cnt++;
		}
		System.out.println(es);
		
		

	}

}
