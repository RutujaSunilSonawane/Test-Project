
public class Innerclass {

	public static void main(String[] args) {
		Bank bObj=new Bank("Bank of India","Rutuja@11112000");
		Bank.Locker l= bObj.new Locker(1234,"Sangamner");
		l.lockerInformation();

	}

}
