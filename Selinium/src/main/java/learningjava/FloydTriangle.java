package learningjava;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	1. Assign the values
		int n, i, j, num = 1;
		//2. Get the input from the user
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the numbers for FloydTriangle: ");
		n = value.nextInt();
		value.close();
		System.out.println("Floyd's Triangle : -");
		//3. Using loop find the values in triangle
		for (i = 1; i <= n ; i++)
		{
			for(j = 1; j <= i ; j++)
			{
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

}
