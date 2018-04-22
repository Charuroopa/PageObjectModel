package learningjava;

import java.util.Scanner;

public class LargestNumber {

	/*	public static void largestNumber(String str, String digit)
	{
		//Converting digit to char

		char c = Integer.toString(digit).charAt(0);

		//Decrementing number & checking whether it contains digit

		for (int i = number; i > 0; --i)
		{
			if(Integer.toString(i).indexOf(c) == -1)
			{
				//If 'i' doesn't contain 'c'

				return i;
			}
		}

		return -1;
		String subtractMe = null;
		char[] numberCharArray = str.toCharArray();
		int number = Integer.parseInt(str);
		int takeOff = 0;
		for(int i=0;i<numberCharArray.length;i++) {
		if (digit.equals(String.valueOf(numberCharArray[i]))){
		subtractMe=String.valueOf(numberCharArray).substring(i+1);
		break;
		}
		}
		System.out.println(subtractMe);
		takeOff = Integer.parseInt(subtractMe)+1;

		System.out.println(number-takeOff);
	}

	public static void main(String[] args)
	{

		Scanner value = new Scanner(System.in);

		System.out.println("Enter the number: ");
		String strnum = value.next();

		System.out.println("Enter the digit:  ");
		String strdigit = value.next();

		largestNumber(strnum, strdigit);


	}*/
	static int getLLessThanN(int number, int digit)
	{
		//Converting digit to char

		char c = Integer.toString(digit).charAt(0);

		//Decrementing number & checking whether it contains digit

		for (int i = number; i > 0; --i)
		{
			if(Integer.toString(i).indexOf(c) == -1)
			{
				//If 'i' doesn't contain 'c'

				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args)
	{
				
		Scanner value = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int number = value.nextInt();
		
		System.out.println("Enter the digit : ");
		int digit = value.nextInt();
				
		//getLLessThanN(number, digit);
		
		System.out.println(getLLessThanN(number, digit));
		
		
		value.close();
	}
}

