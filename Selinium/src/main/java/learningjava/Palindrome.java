package learningjava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		1. Get the input and store in a variable
		//int number = 555,

		int reminder, sum = 0 ;

		Scanner number = new Scanner(System.in);

		System.out.println("Enter the value for the number to find palindrome or not : " );

		int palin = number.nextInt();

		//	2. Store the input in temperory variable
		int temp = palin;

		//	3. Reverse the number using loop
		while(palin>0)
		{
			reminder = palin%10;
			sum = (sum * 10)+reminder;
			palin = palin/10;
		}
		//	4. Check whether the number is palindrome or not using if condition
		if(temp==sum)
		{
			//			5. Print
			System.out.println("The number is palindrome number ");
		}
		else
		{
			//	    	5. Print
			System.out.println("The number is not palindrome ");
		}

		number.close();
	}

}
