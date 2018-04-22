package inheritanceConcept;

import java.util.Scanner;

public class ClassA {
	//Odd or even number

	int num;

	public void oddeven()
	{
		System.out.println("Enter the integer value: " + " ");
		//The input provided by user is stored in num
		Scanner value = new Scanner(System.in);
		num = value.nextInt();
		value.close();

		/* If number is divisible by 2 then it's an even number
		  else odd number*/

		if(num % 2 == 0)
			System.out.println("This is even number: " + num);
		else
			System.out.println("This is odd number: " + num);
	}

}
