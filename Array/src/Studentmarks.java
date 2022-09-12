
public class Studentmarks
{
	public static void main(String[] args)
	{
	//int[] marks=new int[5];
	int[] marks= {69,90,78,89,67};
	//System.out.println(marks.length);
	//System.out.println(marks[3]);
	for(int i=0;i<marks.length;i++)
	{
		System.out.println(marks[i]);
	}
	for(int i=marks.length-1;i>0;i--)
	{
		System.out.println(marks[i]);
	}
	System.out.println("for each loop");
	for(int element:marks)
	{
		
		System.out.println(element);
	}
	}

}
