import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args)
	{
		PriorityQueue<Candidate>p=new PriorityQueue<>();
		p.add(new Candidate(101,78,89,"Nikhil",80.0f));
		p.add(new Candidate(102,95,90,"Rutuja",95.0f));
		p.add(new Candidate(103,80,85,"Kajal",80.0f));
		System.out.println(p);

	}

}
