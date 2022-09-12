
public class ParsingMethod {

	public static void main(String[] args) {
		int itemid=Integer.parseInt(args[0]);
		float itemPrice=Float.parseFloat(args[1]);
		boolean availability=Boolean.parseBoolean(args[2]);
		System.out.println("Item Details are");
		System.out.println("Item id:"+itemid);
		System.out.println("Item price:"+itemPrice);
		System.out.println("Item availability:"+availability);
	}

}
