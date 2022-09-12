package ContainmentAssignment;

public class InstituteContainment {

	public static void main(String[] args)
	{
		Question q=new Question(11,"What is the Radio?");
		SubTopic sub=new SubTopic(12,"Types of Radio",q);
		Topic t=new Topic(13,"Radio",sub);
		Subject s=new Subject(14,"Radoi Navigation",t);
		Branch b=new Branch(15,"Avionics",s);
		Institute i=new Institute(16,"HAL Pravara Aviation Institute",b);
		
		System.out.println(i);
		
		

	}

}
