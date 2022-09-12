package Tata3;

public class Maneger {

	public static void main(String[] args) 
	{
		Department [] maneger=new Department[5];
		maneger[0]=new Department(1234,"Digital Department");
		maneger[1]=new Department(1235,"Tecnical Department");
		maneger[2]=new Department(1236,"Computer Department");
		maneger[3]=new Department(1237,"Engineering Department");
		maneger[4]=new Department(1238,"College Department");
		
		System.out.println("Department maneger 1:");
		maneger[0].display();
		System.out.println("Department maneger 2:");
		maneger[1].display();
		System.out.println("Department maneger 3:");
		maneger[2].display();
		System.out.println("Department maneger 4:");
		maneger[3].display();
		System.out.println("Department maneger 5:");
		maneger[4].display();
		
		

	}

}
