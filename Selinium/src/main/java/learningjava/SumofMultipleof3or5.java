package learningjava;

import java.util.Scanner;

public class SumofMultipleof3or5 {

	public static double multipleof3or5(double value)
	{
		double sum = 0;
        for (double i = 0; i < value; i++)
        {
            /* "%" is the modulus operator */
            if ((i % 3 == 0) || (i % 5 == 0))
            {
                sum = sum + i;
               System.out.print("The values are: " );
               System.out.println(i);
            }
                   }
        return sum;
	}
	
	public static void main(String args[])
	{
		System.out.println("Enter the sum of integers");
		Scanner num = new Scanner(System.in);
		double value = num.nextDouble();
		
		System.out.println(multipleof3or5(value));
		num.close();
	}
}
