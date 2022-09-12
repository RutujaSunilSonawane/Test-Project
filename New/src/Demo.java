
public class Demo {
	public void display()
	{
		int[] arr= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(+arr[i]);
			}
		
		}
		
	}
	
	public static void main(String[] args) {
	
			Demo obj=new Demo();
			obj.display();
	}

}
