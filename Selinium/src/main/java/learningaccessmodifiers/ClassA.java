package learningaccessmodifiers;

public class ClassA {

	public int age;
	static String name;
	protected static String bloodGroup;
	public  char gender;    

	//age = a(15);



	public int a (int age)
	{
		System.out.println("Age of the person" + (age));
		return(age);
	}

	public String nam(String name)
	{
		System.out.println("Name and height of the person" + (name));
		return(name);
	}

	String main (String bloodGroup)
	{
		System.out.println("Bloodgroup for the person" + (bloodGroup));
		return(bloodGroup);
	}

	public char gen(char gender)
	{
		System.out.println("Gender for the person" + (gender));
		return(gender);
	}



}
