package AssignmentString;

public class MaximumOccurance {

	public static void main(String[] args) {
		String s="askdjszxaascv";
		int arr[]=new int[127];
		for(int i=0;i<=s.length()-1;i++)
		{
			arr[s.charAt(i)]=arr[s.charAt(i)]+1;
		}
		int max=-1;
		char ch=' ';
		for(int i=0;i<=s.length()-1;i++)
		{
			if(max<arr[s.charAt(i)])
			{
				max=arr[s.charAt(i)];
				ch=s.charAt(i);
			}
		}
		System.out.println("Maximum occurance:"+ch);
	}

}
