import java.util.Scanner;

public class Abc {



	
	  public static void main(String[]args)
	  {

	        Scanner sc= new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();

	        boolean isAPrime = true;

	        for (int i = 2; i <= a / 2; i++) {

	            if (a % i == 0) {
	                isAPrime = false;
	                break;
	            }

	        }

	        if (isAPrime && Math.abs(a - b) == 2) {
	            
	            boolean isBPrime = true;
	            
	            for (int i = 2; i <= b / 2; i++) {

	                if (b % i == 0) {
	                    isBPrime = false;
	                    break;
	                }
	                
	            }
	            
	            if (isBPrime)
	                System.out.println(a + " and " + b + " are twin prime");
	            else
	                System.out.println(a + " and " + b + " are not twin prime");
	        }
	        sc.close();
	      
	    }
	}

