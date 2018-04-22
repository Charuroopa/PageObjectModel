package implementInheritcance;

public class Car extends Vehicle{

	public void stearing()
	{
		System.out.println("In car stearing will be different but actions are same");
	}
	public void brake()
	{
		System.out.println("For all vehicle brake is most important");
	}
	public void gear()
	{
		System.out.println("In most of the cars there are automatic gears");
	}
	
	public static void main(String args[])
	{
		Car obj3 = new Car();
		
		obj3.brake();
		obj3.stearing();
		obj3.gear();
	}
}
