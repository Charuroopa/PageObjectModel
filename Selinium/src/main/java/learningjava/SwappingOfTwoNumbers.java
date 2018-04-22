package learningjava;

import java.util.Scanner;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Assign a variable
		int x,y;
		int temp;
	//2. Get the values from the user
		Scanner swap = new Scanner(System.in);
	
		System.out.println("Get the values of x and y is: ");
		//3. We can perform this action in two ways one is by string and another one is by giving integer value.
		x= swap.nextInt();
		y = swap.nextInt();

	
	//4.Print the values what we get and do swapping
		System.out.println("Enter the values before swapping: " + "x = " + x + " y = " + y);

		temp = x;
		x = y;
		y = temp;

		System.out.println("Enter the values after swapping: " + "x = " + x + " y = " + y);

	//5. Print the values what we get and do swapping

		System.out.println("This coding is to perform by using only two values: ");
		
		System.out.println();
		
		System.out.println("Enter the values before swapping: " + "x = " + x + " y = " + y);

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("Enter the values after swapping: " + "x = " + x + " y = " + y);

		swap.close();

		
	}

}
