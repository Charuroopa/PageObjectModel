package inheritanceConcept;

import java.util.Scanner;

public class ClassC extends ClassB {

	//factorial program using for loop
	int n, factorial = 1;
	int i;

	public void fact ()
	{
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the number for factorial: ");
		n = value.nextInt();
		for (i = 1; i<=n ; i++)
		{
			factorial = factorial * i;
		}
		System.out.println("The factorial value using for loop of number " + n + "is : " + factorial);
		System.out.println();
		value.close();
	}

	public void usingwhile()
	{
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the number for factorial: ");
		int num = value.nextInt();
		i = 1;
		while(i<=num) {
			factorial = factorial * i;
			i++;
		}
		System.out.println("The factorial value using while loop of number " + num + "is : " + factorial);
		value.close();
	}

	public void usingif()
	{
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the number for factorial using if: ");
		n = value.nextInt();
		if (n >= 0)
		{
			for (i = 1; i<=n ; i++)
			{
				factorial = factorial * i;
			}
			System.out.println("The factorial value using for loop of number " + n + "is : " + factorial);
			System.out.println();
			value.close();
		}
		else

			System.out.println("Enter a Whole number which is greater than zero");
		System.out.println();
	}

}
