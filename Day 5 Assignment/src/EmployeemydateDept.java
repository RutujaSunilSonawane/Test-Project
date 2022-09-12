
public class EmployeemydateDept {

	public static void main(String[] args) {
		/*Mydate m=new Mydate(2022,"Monday","August");
		 * Dept d=new Dept(123,"Computer Department");
		 * Employee e=new Employee(1234,"Nikhil",50000.00,d,m);
		 * System.out.println(e);
		 */
		// Setter Getter method
		Mydate m=new Mydate();
		m.setYear(2022);
		m.setDay("Monday");
		m.setMonth("August");
		Dept d=new Dept();
		d.setDept_id(123);
		d.setDept_name("Computer Department");
		Employee e=new Employee();
		e.setId(1234);
		e.setName("Nikhil");
		e.setSalary(500000);
		e.setDObj(d);
		e.setMDObj(m);
		System.out.println(e);
		
		

	}

}
