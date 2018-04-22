package learningjava;

import java.util.Scanner;

public class Matrix2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	1. Assign a variable in data type for the 2d matrix.
		int one, two;
		//2. Get the values for one and two by using scanner

		Scanner matrix = new Scanner(System.in);

		//		3. Get the values for one and two

		System.out.println(" Enter the values for one : ");
		one = matrix.nextInt();
		System.out.println(" Enter the values for two : ");
		two = matrix.nextInt(); 
		int square[][] = new int[one][two];
		
		System.out.println("Enter the values " + (one*two) + "Array elements : ");
		//4. By using loops print the values of one and two
		for (int i = 0 ; i < one; i++)
		{
			for(int j = 0; j < two ; j++)
			{
			//	System.out.println("Enter the matrix value of one " + i + " and two " + j);
				square[i][j] =  matrix.nextInt();
			}
		}

		
		//				5. Print the values in square
		for (int i = 0 ; i < one; i++)
		{
			for(int j = 0; j < two ; j++)
			{
				System.out.print(square[i][j] + " ");
			}
			System.out.println();
		}

		matrix.close();
	}

}
