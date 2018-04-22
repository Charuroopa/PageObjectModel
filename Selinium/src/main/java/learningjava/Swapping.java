package learningjava;

import java.util.Scanner;

//import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		
		
		//Get the string value from the user.
		
		Scanner string = new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String val1 = string.nextLine();
		System.out.println("Enter the second String: ");
		String val2 = string.nextLine();
		//String val3;
		
		string.close();
		
		System.out.println("The String values before swapping: val1 =" + val1 + "  val2 = " + val2 + " ");
		val1 = val1 + val2;

		// Store the string val1 in val2
		val2 = val1.substring(0,val1.length() - val2.length());
		//Store the string val2 in val1
		val1 = val1.substring(val2.length());
		System.out.println();
		System.out.println("The String values after swapping: val1 = " + val1 + " val2 = " + val2);

		/*System.out.println();
		System.out.println(" The procedure for swapping using third variable");
		val3 = val1;
		val1 = val2;
		val2 = val3;
		System.out.println();
		System.out.println("The String values after swapping: val1 = " + val1 + " val2 = " + val2);
*/
	}

}
