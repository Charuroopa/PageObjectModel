package learningjava;

import java.util.Scanner;

public class LogicalOperatorUsingConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		Logical Operator

		//		1. Get the input and store in variables

		//		int number1, number2;
		boolean flag = true;
		Scanner num = new Scanner(System.in);
		int number1 = num.nextInt();
		int number2 = num.nextInt();
		num.close();

		//		2. Proceed the logical operations and print the values
		System.out.println("increment value of number1 " + (number1++));
		System.out.println("Number1 after increment " + (number1));
		System.out.println("prefix increment the value of number1 " + (++number1));
		System.out.println("Again get the value after increment " + (number1));
		System.out.println("Suffix decrement the value of number2 " + (number2--));
		System.out.println("Value after decrement " + (number2));
		System.out.println("Suffix decrement the value again " + (--number2));
		System.out.println("Value after the decrement " + (number2));
		System.out.println("Get the boolean value " + (flag));
		System.out.println("Get the boolean valve " + !(flag));
		if(number1==7 && number2==1)
			System.out.println("Print number1 " + number1);
		else if(number1==8||flag)
			System.out.println("Print Flag " + flag);
		else
			System.out.println("Print number2 " + number2);

	}

}
