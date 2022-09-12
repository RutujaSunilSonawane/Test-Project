import java.util.PriorityQueue;

public class Candidate
{
	int cid,m1,m2;
	String cname;
	float percentage;
	Candidate()
	{
		
	}
	Candidate(int cid,int m1,int m2,String cname,float percentage)
	{
		this.cid=cid;
		this.m1=m1;
		this.m2=m2;
		this.cname=cname;
		this.percentage=percentage;
	}
	public String toString()
	{
		return cid+" "+m1+" "+m2+" "+cname+" "+percentage;
	}
	

	public static void main(String[] args) {
		PriorityQueue<Candidate>p=new PriorityQueue<>();
		p.add(new Candidate(101,78,89,"Nikhil",80.0f));
		p.add(new Candidate(102,95,90,"Rutuja",95.0f));
		p.add(new Candidate(103,80,85,"Kajal",80.0f));
		System.out.println(p);

	}

}
