package learningjava;

import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Assign a variable and get the input from the user
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		int length = value.nextInt();

//	4. For the method create an object and perform the action again using the loop
		int[] arrayValues = new int[length];
		System.out.println("Enter the elements of an array");
		for(int i =0 ; i < length ; i++)
		{
			arrayValues[i] = value.nextInt();
		} 
		int numbers = secondLargestNumber(arrayValues);
		System.out.println("Second Largest Number is: " + numbers);
		value.close();
	}

	//1. Create a method to generate the second largest number
	public static int secondLargestNumber(int[] array)
	{
		//2. In the method use the loop to find the number and return the value
		
		  for (int i = 0; i < array.length; i++) {
	            for (int j = 0; j < array.length - 1; j++) {
	                if (array[j] < array[j + 1]) {
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	        // Return second largest number
	        return array[1];
	}


}
