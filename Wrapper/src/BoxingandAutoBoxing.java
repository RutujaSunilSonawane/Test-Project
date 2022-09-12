
public class BoxingandAutoBoxing {

	public static void main(String[] args)
	{
		byte b=20;
		Byte bObj=new Byte(b);//Boxing
		System.out.println("Byte data boxed:"+bObj);
		Byte bObj1=b;//AutoBoxing
		System.out.println("Automatic data boxed:"+bObj1);
		
		byte b1=bObj.byteValue();//unBoxing
		System.out.println("nuBoxing value:"+b1);
		
		
		byte b3=bObj;
		System.out.println("Automatic data unboxed:"+b3);
		Integer o2=45;
		int val=o2;
		int val1=o2.intValue();
		System.out.println(val1);
		
		
		Short sObj=12;
		System.out.println("Short type autoboxing"+sObj);
		
		
		
		
		
	

	}

}
