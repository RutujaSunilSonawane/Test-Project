package Containment;

public class Propertity {

	public static void main(String[] args) {
		//OpratingSystem os=new OpratingSystem("Window 10","Debian",17.10);
		OpratingSystem os=new OpratingSystem();
		os.setOSName("Window 10");
		os.setVendor("Debian");
		os.setVersion(17.1);
		
		//Laptop l=new Laptop("Linux",40000,os);
		Laptop l=new Laptop();
		l.setBrand("Linux");
		l.setCost(40000);
		l.setOSObj(os);
		
		System.out.println(l);
		

	}

	

	

}
