
public class Containment {

	public static void main(String[] args)
	{
		Institute i=new Institute();
		i.setId(101);
		i.setIName("HAL pravara");
		
		Branch b=new Branch();
		b.setId(102);
		b.setBName("Avionics");
		b.setIObj(i);
		
		Subject s=new Subject();
		s.setId(103);
		s.setSName("Radio");
		s.setBObj(b);
		
		Topic t=new Topic();
		t.setId(104);
		t.setTName("Radar");
		t.setSObj(s);
		
		Subtopic sub=new Subtopic();
		sub.setId(105);
		sub.setSName("weather");
		sub.setTObj(t);
		
		Question q=new Question();
		q.setId(106);
		q.setQName("what is radar");
		q.setSubObj(sub);
		
		
		System.out.println(q);
		

	}

}
