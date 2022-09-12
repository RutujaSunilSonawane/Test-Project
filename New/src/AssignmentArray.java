import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class AssignmentArray {
	public void dublicate()//find dublicate array
	{
		int arr[]= {1,2,3,4,4,5,6,7,2,8};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Dublicate array:"+arr[j]);
				}
			}
		}
	}
	public void pair()//find pair with sum in sorted array
	{
		int arr[]= {1,2,3,4,5,6,7};
		int sum=9;
		int a=0;
		int b=arr.length-1;
		while(a<b)
		{
			if(arr[a]+arr[b]>sum)
			{
				b--;
			}
			else if(arr[a]+arr[b]<sum)
			{
				a++;
			}
			else if(arr[a]+arr[b]==sum)
			{
				System.out.println("pair("+arr[a]+" , "+arr[b]+")");
				a++;
				b--;
			}
		}
	}
	public void evenOdd()
	{
		int arr[]= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("even number:"+arr[i]);
			}
			else
			{
				System.out.println("Odd number:"+arr[i]);
			}
		}
	}
	public void commonArray()//common array three sorted Array
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		int b[]= {11,22,3,44,55,6,7};
		int c[]= {12,13,14,15,16,6,7};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				for(int k=0;k<c.length;k++)
				{
					if(a[i]==b[j] && b[j]==c[k])
						System.out.println(a[i]);
				}
			}
		}
	}
	public void unique()
	{
		int arr[]= {1,2,3,4,5,6,7,8,8,2,3};
		for(int i=0;i<arr.length;i++)
		{
			boolean isUnique=false;
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					isUnique=true;
					break;
				}
			}
			if(!isUnique)
			{
				System.out.println(arr[i]);
			}
		}
	}
	public void occuranceArray()
	{
		int arr[]= {1,2,3,4,6,5,3,4,5,2};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			int cnt=1;
			if(i!=arr.length-1)
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					cnt++;
				break;
			}
			System.out.println(arr[i]+"  "+cnt);
			i+=(cnt-1);
		}
	}
	public void showArray()
	{
		int arr[]= {4,4,5,15,7,19,9,14};
		int num=arr[0];
		for(int i=1;i<arr.length-1;i++)
		{
			if(num+5==arr[i+1])
			{
				System.out.println(num);
				num=arr[i+1];
			}
			
			
		}
	}

	public static void main(String[] args) {
		AssignmentArray obj=new AssignmentArray();
		//obj.dublicate();
		//obj.pair();
		//obj.evenOdd();
		//obj.commonArray();
		//obj.unique();
		//obj.occuranceArray();
		obj.showArray();

	}

}
