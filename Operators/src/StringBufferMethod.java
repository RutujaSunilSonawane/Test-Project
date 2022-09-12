
public class StringBufferMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Rutuja");
		sb.append(" Sonawane");//original string change
		//System.out.println(sb);
		/*sb.insert(1, "Sonawane");
		System.out.println(sb);//insert method
		sb.replace(1, 4, "Sonawane");
		System.out.println(sb);//replace method
		sb.delete(1,3);
		System.out.println(sb);//delete method*/
		//sb.reverse();
		//System.out.println(sb);//reverse method
		System.out.println(sb.capacity());
		//System.out.println(sb);//capasity method
		sb.append("Rushi");
		System.out.println(sb.capacity());
		sb.ensureCapacity(50);
		System.out.println(sb.capacity());//ensure capasity
		
		
		

	}

}
