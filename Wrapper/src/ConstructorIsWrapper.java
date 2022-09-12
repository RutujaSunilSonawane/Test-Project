
public class ConstructorIsWrapper {

	public static void main(String[] args)
	{
		Integer i1=new Integer(20);
		Integer i2=new Integer("20");
		System.out.println("constructor is primitive type parameter:"+i1);
		System.out.println("Constructor is String type parameter:"+i2);
		
		//Float type only one constructor
		Float f1=new Float(20.2f);
		Float f2=new Float("20.78");
		Float f3=new Float(23.8d);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		//character type only one constructor
		Character ch=new Character('N');
		System.out.println("Character type object:"+ch);

	}

}
