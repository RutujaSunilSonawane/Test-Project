import java.util.Scanner;

public class Xyz {


//create FindAllTwinPrimeNumbers class to get all the twin prime numbers in the given range  
class FindAllTwinPrimeNumbers {  
 
  // create checkPrimeNumber() method to check whether the number is prime or not  
  static boolean checkPrimeNumber(int number)  
  {  
      int i;  
      int m = 0;  
      int flag = 0;        
      m = number/2;        
      if(number == 0 || number == 1){    
          return false;        
      }else{    
          for(i = 2; i <= m ;i++){        
              if(number%i == 0){        
                  flag=1;        
                  return false;       
              }        
          }        
          if(flag == 0)    
          {   
              return true;  
          }    
      }  
      return false;  
  }  
 
  // create checkTwinPrimeNumber() to check whether the numbers are twin prime or not  
  static boolean checkTwinPrimeNumber(int number1, int number2)  
  {  
      if(checkPrimeNumber(number1) && checkPrimeNumber(number2) && Math.abs(number1 - number2) == 2)  
          return true;  
      else  
          return false;  
  }  
 
  /* Driver program to test above function */  
  public static void main(String[] args)  
  {  
      int startRange, endRange;  
        
      //create scanner class object  
      Scanner sc=new Scanner(System.in);  
        
      //show custom message  
      System.out.println("Enter start value");  
        
      //store user entered value into variable startRange  
      startRange = sc.nextInt();  
        
      //show custom message  
      System.out.println("Enter last value");  
        
      //store user entered value into variable endRange  
      endRange = sc.nextInt();  
        
      System.out.println("The pairs of twin primes between" + startRange + " and " + endRange + "are:");  
        
      for (int i = startRange; i < endRange; i++) {  
          if (checkTwinPrimeNumber(i, (i + 2))){  
              System.out.printf("(%d, %d)\n", i, i + 2);  
          }  
      }  
  }  
}  


}
