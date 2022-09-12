
public class Fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print fibonacci series up to 20 series//
		int i;
		int n=20,firstTerm=0,secondTerm=1;
		{
		System.out.println("fibonacci series till"+n+"terms:");
		}
			for(i=1;i<=n;i++)
				{
			System.out.println(+firstTerm);
			int nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
				}

	}

}
