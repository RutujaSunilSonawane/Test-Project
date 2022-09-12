package methodOverriding;

public class Item
{
	int Id,cost;
	String itemName;
	Item(int i,int j,String string)
	{
		Id=i;
		cost=j;
		itemName=string;
	}
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		String str="ID:"+Id+"cost:"+cost+"ItemName:"+itemName;
		return str;
	}
	public void showDetails()
	{
		System.out.println("Item Id:"+Id);
		System.out.println("Item cost:"+cost);
		System.out.println("ItemName:"+itemName);
	}
	
	
	
		public void acceptItemDetails(Item i[])
		{
		i[0]=new Item(1,300,"Pant");
		i[1]=new Item(2,500,"Shirt");
		i[2]=new Item(3,200,"watch");
		}
		/*public void showItem(Item i[])
		  {
		  System.out.println(Array.toString(i));
		  }
		  */
		 public void showItem(Item a[])
		 {
			 for(int j=0;j<a.length;j++)
			 {
				System.out.println(a[j]); 
			 }
		 }
		 public void showCost(Item arr[])
		 {
			 for(int k=0;k<arr.length;k++)
			 {
				 if(arr[k].cost>200)
				 {
					 System.out.println(arr[k]);
				 }
			 }
		 }
		 public void MinMaxCost(Item a[])
		   {
		  	int min=Integer.MAX_VALUE;
		   int max=0;
		   for(int j=0;j<a.length;j++)
		   {
		   if(a[j].cost<min)
		   {
		   min=a[j].cost;
		   }
		   if(a[j].cost>max)
		   {
		   max=a[j].cost;
		   }
		   }
		   System.out.println("Maximum cost:"+max);
		   System.out.println("Minimum cost:"+min);
		   }
		 	public void averageOfCost(Item a[])
		 	{
		 		int sum=0;
		 		double avg=0;
		 		for(int i=0;i<a.length;i++)
		 		{
		 			sum=sum+a[i].cost;
		 			avg=sum/a.length;
		 		}
		 		System.out.println("Average of cost="+avg);
		 	}
	
	public static void main(String[] args)
	{
		Item s=new Item();
		Item []i;
		i=new Item[3];
		
		s.acceptItemDetails(i);
		//s.showItem(i);
		s.showCost(i);
		//s.MinMaxCost(i);
		//s.averageOfCost(i);
		

	}

}
