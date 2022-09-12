
public class ArthamaticException {
	public void doTask(int a,int b) {
		int result=a/b;
		System.out.println("Division is:"+result);
		
	}

	public static void main(String[] args) 
	{
		ArthamaticException ae=new ArthamaticException();
		ae.doTask(1, 0);
		
		
	}

}
