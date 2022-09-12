import java.util.Scanner; 
 
class Semester{ 
 int mr1,mr2,mr3,rol; 
 Scanner sc=new Scanner(System.in); 
 public void acceptMarks(){ 
	 System.out.print("\nEnter Roll:: "); 
	 rol=sc.nextInt(); 
	 System.out.print("Enter Marks1:: "); 
	 mr1=sc.nextInt(); 
	 System.out.print("Enter Marks2:: "); 
	 mr2=sc.nextInt(); 
	 System.out.print("Enter Marks3:: "); 
	 mr3=sc.nextInt(); 
 	} 
 	
  
 		public void display(){ 
 			System.out.print("\nRoll::"+rol); 
 			System.out.print(" Marks1::"+mr1); 
 			System.out.print(" Marks2::"+mr2); 
 			System.out.print(" Marks3::"+mr3); 
 } 
}