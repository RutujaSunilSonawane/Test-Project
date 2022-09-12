package Containment;

public class StayArrangement {
	

	public static void main(String[] args)
	{
		Outhouse obj=new Outhouse();
		obj.setONo(12);
		obj.setOArea(12.00f);
		
		
		Banglo b=new Banglo();
		b.setOName("abc");
		b.setBName("Xyz");
		b.setNRoom(123);
		b.setHObj(obj);
		
		System.out.println(b);
		
		
	

	}

}
