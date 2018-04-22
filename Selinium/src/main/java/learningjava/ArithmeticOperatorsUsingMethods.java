package learningjava;

public class ArithmeticOperatorsUsingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArithmeticOperatorsUsingMethods obj = new ArithmeticOperatorsUsingMethods();
		
	//	obj.multiplication(number1, number2);
		
		int sum = add(2,5);
		System.out.println("The Addition of two number is " + sum);

		int difference = sub(7,2);
		System.out.println("The Subtraction of two number is " + difference);

		int modular = modular(7,2);
		System.out.println("The Modular of two number is " + modular);

		int multiply = multiplication(7,2);
		System.out.println("The Multiplication of two numbers is " + multiply);

		int divide = division(7,2);
		System.out.println("The Division of two numbers is " + divide);

	}

	public static int modular(int number1 ,int number2)
	{
		//		System.out.println("The Modular of two number is " + number1%number2);
		return(number1 % number2);
	}
	public static int sub(int number1 ,int number2)
	{
		//		System.out.println("The Subtraction of two number is " + (number1-number2));
		return(number1 - number2);
	}

	public static int multiplication(int number1 ,int number2)
	{
		//		System.out.println("The Multiplication of two numbers is " + number1*number2);
		return(number1 * number2);
	}

	public static int division(int number1 ,int number2)
	{

		//	System.out.println("The Division of two numbers is " + number1/number2);
		return(number1 / number2);
	}

	public static int add(int number1 ,int number2)
	{
		//		System.out.println("The Addition of two number is " + (number1+number2));
		return(number1 + number2);
	}


}
