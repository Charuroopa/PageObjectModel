package implementInheritcance;

public class Audi extends Car {

	public void music()
	{
		System.out.println("In audi music system will be more powerful");
	}
	
	public void seat(String features)
	{
		System.out.println("Seat will be different and more space");
	}
	
	public static void main(String args[])
	{
		Audi obj2 = new Audi();
		obj2.seat("Good Leather");
		obj2.gear();
		obj2.vehicle();
		
	}
}

