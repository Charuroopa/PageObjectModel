package learningjava;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Arithmetic operator


//1. Get the input and stored in variable
	//int number1 = 25 , number2 = 10;
	
	Scanner number1 = new Scanner(System.in);
	
	System.out.println("Enter the value of a: " );
	
	int a = number1.nextInt();
	
	//Scanner number2 = new Scanner(System.in);
	
	System.out.println("Enter the value of b: " );
	
	int b = number1.nextInt();
	
		System.out.println("Which action to be performed Addition/Subtraction/Multiplication/Modular/Division: ");
	
	String perform = number1.next();
	
	switch(perform)
	{
	case "Add":
	{
		System.out.println("The Addition of two number is " + (a+b));
		break;
	}
	case "Subtract":
	{
		System.out.println("The Subtraction of two number is " + (a-b));
		break;
	}
	case "Multiply":
	{
		System.out.println("The Multiplication of two numbers is " + a*b);
		break;
	}
	case "Divide":
	{
		System.out.println("The Division of two numbers is " + a/b);
		break;
	}
	case "Modular":
	{
		System.out.println("The Modular of two number is " + a%b);
		break;
	}
	default:
	{
		System.out.println("There is no logic to perform arithmetic operation");
	}
	
	}

	number1.close();
	
	//number2.close();
	
//2.Do arithmetic logics and print the numbers
	/*
	System.out.println("The Modular of two number is " + a%b);
	System.out.println("The Addition of two number is " + (a+b));
	System.out.println("The Subtraction of two number is " + (a-b));
	System.out.println("The Multiplication of two numbers is " + a*b);
	System.out.println("The Division of two numbers is " + a/b);
			
*/	}

}
