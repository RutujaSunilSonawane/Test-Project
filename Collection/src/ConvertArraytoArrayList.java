import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ConvertArraytoArrayList 
{
	public void createList()
	{
		String city[]= {"Sangamner","Nashik","Pune","Mumbai"};
		ArrayList<String>cityList=new ArrayList<>(Arrays.asList(city));
		//Manually converser
		for(int i=0;i<city.length;i++)
		{
			cityList.add(city[i]);
		}
		//Array TO ArrayList conversion
		
		Collections.addAll(cityList,city);
		cityList.add("Satara");
		cityList.add("Akola");
		for(String str:cityList)
		System.out.println(str);
		
	}

	private String[] city() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) 
	{
		ConvertArraytoArrayList obj=new ConvertArraytoArrayList();
		obj.createList();
	

	}

}
