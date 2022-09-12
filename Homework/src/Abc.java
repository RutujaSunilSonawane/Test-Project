
public class Abc
{
		 int rollno;  
		 String name;  
		 String city;  
		  
		 Abc(int rollno, String name, String city){  
		 this.rollno=rollno;  
		 this.name=name;  
		 this.city=city;  
		 }  
		   
		 public String toString()
		 {
		  return rollno+" "+name+" "+city;  
		 }  
		 public static void main(String args[]){  
		   Abc s1=new Abc(101,"Raj","lucknow");  
		   Abc s2=new Abc(102,"Vijay","ghaziabad");  
		     
		   System.out.println(s1); 
		   System.out.println(s2);
		 }  
		}  

