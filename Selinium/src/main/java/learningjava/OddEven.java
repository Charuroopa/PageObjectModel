package learningjava;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
			System.out.println("Enter the integer value: " + " ");
			//The input provided by user is stored in num
			Scanner value = new Scanner(System.in);
			num = value.nextInt();
			value.close();

			/* If number is divisible by 2 then it's an even number
			  else odd number*/

			if(num % 2 == 0)
				System.out.println(num + " is even number");
			else
				System.out.println(num + " is odd number");
	

	}

}
