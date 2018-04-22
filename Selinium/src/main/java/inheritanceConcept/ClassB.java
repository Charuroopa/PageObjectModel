package inheritanceConcept;

public class ClassB extends ClassA {
	
	String val1 = "Hi";
	String val2 = "Logic";
	String val3 = null;
	
	public void swap ()
	{
		System.out.println("The String values before swapping: val1 =" + val1 + "  val2 = " + val2 + " ");
		val1 = val1 + val2;
		
		// Store the string val1 in val2
		val2 = val1.substring(0,val1.length() - val2.length());
				val1 = val1.substring(val2.length());
				System.out.println();
		System.out.println("The String values after swapping: val1 = " + val1 + " val2 = " + val2);
				
	}
	
	public void usingthirdvariable()
	{
		System.out.println();
		val3 = val1;
		val1 = val2;
		val2 = val3;
		System.out.println();
		System.out.println("The String values after swapping: val1 = " + val1 + " val2 = " + val2);
	}

}
