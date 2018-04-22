package learningjava;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Assign a variable
		int year;
		boolean isLeap = false;
		//2. Get the input from the user

		Scanner value = new Scanner(System.in);
		System.out.println("Enter the year: ");
		year = value.nextInt();
		value.close();

		//	3. Check the condition whether the given year is leap yr or not

		/*		if(year % 4 == 0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0)

					isLeap = true;
				else
					isLeap = false;
			}
			else
				isLeap = true;
		}
		else
		{
			isLeap = false;
		}
		if(isLeap == true)
			System.out.println(year +" is leap year");

		else
			System.out.println(year + " is not a leap year");
		 */

		if(year % 400 == 0)
		{
			isLeap = true;
		}
		else if (year % 100 == 0)
		{
			isLeap = false;
		}
		else if(year % 4 == 0)
		{
			isLeap = true;
		}
		else
		{
			isLeap = false;
		}
		if(isLeap)
		{
			System.out.println("Year "+year+" is a Leap Year");
		}
		else
		{
			System.out.println("Year "+year+" is not a Leap Year");

		}

	}
}