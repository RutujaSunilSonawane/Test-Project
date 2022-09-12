package Inheritance;

class Branch
{
	int bId;
	String bName;
	
	public void branch(int i,String n)
	{
		bId=i;
		bName=n;
		System.out.println("Branch id:"+bId);
		System.out.println("Branch name:"+bName);
	}
	
}
class Subject extends Branch
{
	int sId;
	String sName;
	
	public void subject(int i,String n)
	{
		sId=i;
		sName=n;
		System.out.println("Subject id:"+sId);
		System.out.println("Subject name:"+sName);
	}
	
}
class Topic extends Subject
{
	int tId;
	String tName;
	
	public void topic(int i,String n)
	{
		tId=i;
		tName=n;
		
		System.out.println("Topic id:"+tId);
		System.out.println("Topic name:"+tName);
	}
}

public class Question {

	public static void main(String[] args) 
	{
		Topic t=new Topic();
		System.out.println("Topic Information");
		t.topic(11, "Weather Radar");
		System.out.println("Subject Information");
		t.subject(12, "Radio Navigation");
		System.out.println("Branch Information");
		t.branch(12, "Avionics");
	

	}

}
