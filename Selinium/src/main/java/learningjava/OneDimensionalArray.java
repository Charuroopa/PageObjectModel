package learningjava;

import java.util.Scanner;

public class OneDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n , i;
		int value[] = new int[50];
		Scanner arrValue = new Scanner(System.in);
		
		System.out.print("Enter the elements to be stored in the array: \n");
		
		n = arrValue.nextInt();
		
		System.out.println();
		System.out.print(n + " elements are : ");
		
		for (i = 0; i<n ; i++) {
			value[i] = arrValue.nextInt();
			System.out.println("The values are: " + value[i]);
		}
	
		for(i = 0; i < n; i++)
		{
			System.out.println();
			System.out.println("The values are: " + i);
		}
		arrValue.close();	
	}


	

}
