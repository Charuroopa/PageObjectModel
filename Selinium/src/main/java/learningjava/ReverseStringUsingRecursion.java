package learningjava;

import java.util.Scanner;

public class ReverseStringUsingRecursion {
	private static int Reverse = 0;
	public static void main(String[] args) {

		Scanner keys = new Scanner(System.in);
		String inputStr;
		System.out.println("Enter the string to reverse");
		inputStr = keys.nextLine();
		System.out.println("Enter the integer value");
		int inputInt = keys.nextInt();
		System.out.println("Reverse String is: ");
		System.out.println(reverseString(inputStr));
		System.out.println("Reverse number is: ");
		System.out.println(reverseInt(inputInt));
		keys.close();
	}

	public static String reverseString(String str){
		if (str.length() == 1) {
			return str;
		}
		return reverseString(str.substring(1)) + str.charAt(0);
	}

	public static int reverseInt(int num)
	{
		int Reminder;
		while(num > 0) {
			Reminder = num %10;
			Reverse = Reverse * 10 + Reminder;
			num = num /10;
		}
		return Reverse;
	}
}
