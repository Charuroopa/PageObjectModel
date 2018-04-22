package learningjava;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	1. Assign two variables
		int num1,num2;
		//	2. Get the values from the user
		System.out.println("Enter the value of num1: ");
		Scanner value = new Scanner(System.in);
		num1 = value.nextInt();
		System.out.println("Enter the value of num2: ");
		num2 = value.nextInt();
		// 3. Perform the action by using if condition
		System.out.print(num1 + "\t");
		
	//if(num1 != 0 && num2 != 0)
		for (int i = num1 ; i <= num2; i++)
		{
			/*for (int j = num2 ; j <= num1 ; j++)
			{*/
			if(i%3 == 0 )//|| j%3 == 0)
			{
				System.out.print("FIZZ" + "\t");	
			}
			if (i%5 == 0 )//|| j%5 == 0)
			{
				System.out.print("BUZZ" + "\t");	
			}
			if(i%3 == 0 && i%5 == 0 )
			{

				System.out.print("FIZZBUZZ" + "\t");
			}
			
			if(i%3 != 0 || i%5 != 0)
			{
				System.out.print(i + "\t");
			}
			else
				System.out.print(num2 + "\t");
		//}
		}
		value.close();
	}

}
