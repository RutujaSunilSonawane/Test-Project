public class Exam { 
 
 public Semester calculateResult(Semester obj1,Semester obj2) { 
  Semester fr=new Semester(); 
  	fr.mr1=obj1.mr1+obj2.mr1; 
  	fr.mr2=obj1.mr2+obj2.mr2; 
  	fr.mr3=obj1.mr3+obj2.mr3; 
  	return fr; 
 } 
  
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
  Semester s1=new Semester(); 
  Semester s2=new Semester(); 
   
  System.out.print("\n*Sem I*"); 
  s1.acceptMarks(); 
  s1.display(); 
  System.out.print("\n\n*Sem II*"); 
  s2.acceptMarks(); 
  s2.display(); 
   
  Exam e=new Exam(); 
  Semester s=e.calculateResult(s1, s2); 
  System.out.print("\n*Final Result*"); 
  System.out.print("\n\nTotal of Subject 1 ::"+s.mr1); 
  System.out.print("\n\nTotal of Subject 2 ::"+s.mr2); 
  System.out.print("\n\nTotal of Subject 3 ::"+s.mr3); 
 } 
 
}