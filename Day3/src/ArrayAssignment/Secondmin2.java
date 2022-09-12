package ArrayAssignment;
//WAP to find 2nd min value in an array [-20,0,-25,15,19,37,23]//

public class Secondmin2
{
	void minSecond(int[]a)
{
	System.out.print("Second Minimum number is ");
	int min=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]<min) 
		{
			min=a[i];
		}
	}
	int secondMin=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]<secondMin && a[i]!=min)
		{
			secondMin=a[i];
			
		}
	}
	System.out.print(secondMin);
}

	public static void main(String[] args)
	{
		int A[]= {-20,0,-25 , 15,19,37,23};
		Secondmin2 se=new Secondmin2();
		se.minSecond(A);
		


}




}
