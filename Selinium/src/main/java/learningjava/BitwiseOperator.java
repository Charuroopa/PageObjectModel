package learningjava;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bitwise Operator

//		1. Get the input and store in variables
		     int number1 = 50, number2 = 45, c = 0;
//		     Binary value of 50 = 0010 0010, 45 = 0010 1101
		     
//		2. Proceed the Bitwise operators and print these values
			c = number1&number2;
			  System.out.println("Bitwise AND Value is " + c);
			
			c = number1|number2;
			  System.out.println("Bitwise OR Value is " + c);
			
			c = number1^number2;
			  System.out.println("Bitwise XOR Value is " + c);

			c = ~number2;
			  System.out.println("Bitwise Compliment Value is " + c);

			c = number1>>number2;
			  System.out.println("Bitwise Shift Right Value is " + c);

			c = number1<<number2;
			  System.out.println("Bitwise Shift Left Value is " + c);

			c = number1>>>number2;
			  System.out.println("Bitwise Zero Shift Right Value is " + c);
		

	}

}
