package Containment;

public class Containment {

	public static void main(String[] args) {
		Market m=new Market();
		m.setMName("ABC");
		m.setMLocation("Pune");
		
		
		Shop s=new Shop();
		s.setSName("XYZ");
		s.setSLocation("Nashik");
		s.setSNo(123);
		s.setMObj(m);
		System.out.println(s);

	}

}
