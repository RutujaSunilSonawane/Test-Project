package Interface;

public class PrintingPress {

	public static void main(String[] args) {
		/*	Edit et=new Magzine();
			et.read();
			et.update();
			et.write();
			System.out.println("--------------");
			et=new NewsPaper();
			et.read();
			et.update();
			et.write();*/
			
			Book b=new Book(12,500,"Panipat","xyz");
			System.out.println(b.toString());
			Magzine mg =new Magzine(12,400,"abc","pqr");
			mg.publish("Maximum");
			mg.read();
			mg.update();
			mg.write();
			
			

	}

}
