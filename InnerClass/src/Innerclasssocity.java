
public class Innerclasssocity {

	public static void main(String[] args) {
		Socity s=new Socity(1234,"ABC");
		Socity.Flat f=s.new Flat(101,"XYZ");
		f.showFlatInformation();
		Socity.Audit a=new Socity.Audit("Nashik","11-Nov-2022");
		a.doAudit();
	}

}
