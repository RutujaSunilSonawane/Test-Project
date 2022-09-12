
public class InnerClass {

	public static void main(String[] args) {
		Socity s=new Socity(123,"xyz");
		Socity.Flat f=s.new Flat(101,"abc");
		f.showFlatDetails();
		Socity.Audit a=new Socity.Audit(2022,"PQR");
		a.doAudit();

	}

}
