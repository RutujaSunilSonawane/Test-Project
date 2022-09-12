package Interface;

public class MusicalInstrumentMain {

	public static void main(String[] args)
	{
		PercussionInstrument table=new PercussionInstrument();
		table.play();
		table.listenSound();
		table.learnInstrument();
		
		MusicalInstrument m=new PercussionInstrument();
		m.play();

		StringedInstrument violin=new StringedInstrument();
		violin.play();
		violin.learnInstrument();
		violin.listenSound();
		
		MusicalInstrument mt=new StringedInstrument();
		mt.play();
		

	}

}
