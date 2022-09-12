import java.util.ArrayList;

public class ArrayListtoArray 
{
	public void creatList()
	{
		ArrayList<String>arr=new ArrayList<>();
		arr.add("Rutuja");
		arr.add("Vaishnavi");
		arr.add("Kajal");
		//Conservation of ArrayList to Array
		String array[]=new String[arr.size()];
		for(int i=0;i<arr.size();i++)
		{
			array[i]=arr.get(i);
		}
		for(String str:array)
		{
			System.out.println(str);
		}
		
	}

	public static void main(String[] args)
	{
		ArrayListtoArray obj=new ArrayListtoArray();
		obj.creatList();
		

	}

}
