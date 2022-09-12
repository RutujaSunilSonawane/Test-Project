package Containment;

public class StuInstitute {

	public static void main(String[] args) {
		Student obj=new Student(96,80,100,"Rutuja");
		obj.setM1(96);
		obj.setM2(80);
		obj.setId(100);
		obj.setSName("Rutuja");
		
		
		Institute i=new Institute( "Nashik","Hal",obj);
		
		i.setIName("HAL Pravara Aviation Institute");
		i.setILocation("Nashik");
		i.setStd(obj);
		
		Institute i1=new Institute("Kajal","Pune");
		System.out.println(i1);
		
		
		
		System.out.println(i);
		

	}

}
