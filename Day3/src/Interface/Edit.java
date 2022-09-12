package Interface;

public interface Edit
{
	 void read();
	 void update();
	//void write();
	 
	  default void write()
	 {
		 System.out.println("This is the Write Method");
	 }

}
