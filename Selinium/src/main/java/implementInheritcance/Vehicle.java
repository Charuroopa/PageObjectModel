package implementInheritcance;

public class Vehicle {

	public void vehicle()
	{
	System.out.println("In vehichles there are bikes and cars");
	}
	
	public void tyre()
	{
		System.out.println("All the vechicles has same model");
	}

	public void seat()
	{
		System.out.println("Seat for the car will differ from bikes");
	}
	public static void main(String args[])
	{
		Vehicle obj = new Vehicle();
		obj.vehicle();
		obj.tyre();
		obj.seat();
		
	}
}

