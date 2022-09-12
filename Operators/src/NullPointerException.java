
public class NullPointerException {
	public void doTask()
	{
		System.out.println("this is the null pointer exception");
		
	}

	public static void main(String[] args) {
	
		NullPointerException n=null;
		n.doTask();
		System.out.println("Task completed");
	}

}
  