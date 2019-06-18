package basic_Java;

	class Card
	{
		public void greeting()
		{
		}
	}
	
	class Valentine extends Card
	{
		public void greeting()
		{
			System.out.println("Happy Valentine Day");
		}
	}
	
	class Holiday extends Card
	{
		public void greeting()
		{
			System.out.println("Seasonal Greeting");
		}
	}
	
	class Birthday extends Card
	{
		public void greeting()
		{
			System.out.println("Happy Birthday");
		}
	}
	
	public class InheritanceExample {

	public static void main(String args[])
	{
		Valentine v1 = new Valentine();
		v1.greeting();
		
		Holiday h1 = new Holiday();
		h1.greeting();
		
		Birthday b1 = new Birthday();
		b1.greeting();
	}
	}


