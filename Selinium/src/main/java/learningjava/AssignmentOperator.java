package learningjava;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Assignment Operator

//		1. Get the input and store in variables
		     int a = 20, b = 30, c = 0;

//		2. Assign value in C and print
		 
		      c = a + b;
		      System.out.println("c = a + b = " + c );

//		3. Perform the calculations for assignment operators

		      c += a ;
		      System.out.println("The value of addition equal to " + c );

		      c -= a ;
		      System.out.println("The value of subtraction equal to " + c );

		      c *= a ;
		      System.out.println("The value of multiplication equal to " + c );
		      
		      c /= a ;
		      System.out.println("The value of division equal to " + c );

		      c %= a ;
		      System.out.println("The value of modular equal to " + c );

		      c &= a ;
		      System.out.println("The value of AND equal to " + c );

		      c ^= a ;
		      System.out.println("The value of XOR equal to " + c );

		      c |= a ;
		      System.out.println("The value of OR equal to " + c );
		
		
	}

}
