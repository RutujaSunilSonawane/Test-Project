
package Inheritance;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args)
	{
		SavingAccount s=new SavingAccount();
		s.openAccount(500, "Rutuja",50000);
		s.showAccountDetails();
		s.withdrawAmount();
		s.depositAmount();
		
		Account a=new SavingAccount();
		a.openAccount(500, "Rutuja",5000);
		
	
		
		
	


	}

}
