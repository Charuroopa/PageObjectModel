package learningjava;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Logical Operator

//		1. Get the input and store in variables
		
			int number1 = 10, number2 = 15, number3 = 5;
//		2. Proceed the logical operations and print the values
		
			System.out.println("And Operations " + (number1>number2 & number2>number3));
			System.out.println("And Operations " + (number1>number2 & number2>number3));
			System.out.println("OR Operations " + (number1>number2 | number2>number3));
			System.out.println("NOT Operations " + !(number1<number2));
			System.out.println("XOR Operations " + (number1>number2 ^ number2>number3));
			System.out.println("Conditional AND Operations " + (number1>number2 && number2>number3));
			System.out.println("Conditional OR Operations " + (number1>number2 || number2>number3));
		
		
	}

}
