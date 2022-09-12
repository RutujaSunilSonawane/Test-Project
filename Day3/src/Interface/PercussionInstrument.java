package Interface;
class PercussionIntrument implements MusicalInstrument
	{
		public void play()
		{
			System.out.println("Percussion Instrument is playing method");
		}
		public void learnInstrument()
		{
			System.out.println("Percussion Instrument is learnInstrument method");
		}
	}
/*class StringedInstrument implements MusicalInstrument
	{
		public void play()
		{
			System.out.println("StringedInstrument is playing method");
		}
		public void learnInstrument()
		{
			System.out.println("StringedInstrument Instrument is learnInstrument method");
		}
		
	}*/

class PercussionInstrument extends Sound implements MusicalInstrument
{
	public void listenSound()
	{
		System.out.println("Listening the Percussion Instrument sound");
	}
	public void learnInstrument()
	{
		System.out.println("LearnInstrument the PercussionInstrument sound");
	}
	public void play()
	{
		System.out.println("Percussion Instrument Sound Playing");
	}
}
class StringedInstrument extends Sound implements MusicalInstrument
{
	public void listenSound()
	{
		System.out.println("Listening the StringedInstrument sound");
	}
	public void learnInstrument()
	{
		System.out.println("LearnInstrument the StrinedInstrument sound");
	}
	
	public void play()
	{
		System.out.println("StringedInstrument sound Playing");
	}
}



