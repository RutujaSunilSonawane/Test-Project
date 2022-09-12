import java.util.Scanner;

public class Assignment2Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double basic,hra ,da,gross;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the basic salary:");
		basic=sc.nextDouble();
		if(basic<=10000)
		{
			da=basic*0.8;
			hra=basic*0.2;
		}
		else
			if(basic<=20000)
			{
				da=basic*0.9;
				hra=basic*0.25;
			}
			else
			{
				da=basic*0.95;
				hra=basic*0.3;
			}
		gross=basic+hra+da;
		System.out.println("The gross salary is:"+gross);
		sc.close();
	}

}

