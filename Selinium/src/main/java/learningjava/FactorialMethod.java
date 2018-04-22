package learningjava;

import java.util.Scanner;

public class FactorialMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, factorial = 1;
		int i;

		/*int s = 8, fact = 1;

		for (i = 1; i<=s; i++) {
			fact = fact *i;
		}
*/
/*				Scanner value = new Scanner(System.in);
			System.out.println("Enter the number for factorial: ");
			n = value.nextInt();
			for (i = 1; i<=n ; i++)
			{
				factorial = factorial * i;
			}

			System.out.println("The factorial value using for loop of number " + n + "is : " + factorial);
			value.close();
*/

		/*Scanner value1 = new Scanner(System.in);
		System.out.println("Enter the number for factorial: ");
		int num = value1.nextInt();
		i = 1;
		while(i<=num) {
			factorial = factorial * i;
			i++;
		}
		System.out.println("The factorial value using while loop of number " + num + "is : " + factorial);
		value1.close();


*/		Scanner value2 = new Scanner(System.in);
		System.out.println("Enter the number for factorial using if: ");
		n = value2.nextInt();
		if (n >= 0)
		{
			for (i = 1; i<=n ; i++)
			{
				factorial = factorial * i;
			}
			System.out.println("The factorial value using for loop of number " + n + " is : " + factorial);
			System.out.println();
			value2.close();
		}
		else

			System.out.println("Enter a Whole number which is greater than zero");
		System.out.println();
	}

}
