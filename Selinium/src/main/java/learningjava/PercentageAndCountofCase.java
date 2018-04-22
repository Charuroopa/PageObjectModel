package learningjava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PercentageAndCountofCase {


	static void charPercentage(String input)

	{
		//Getting total no of characters in the given string

		int totalChars = input.length();

		//Initializing upperCaseLetters, lowerCaseLetters, digits and others with 0

		int upperCase = 0;

		int lowerCase = 0;

		int digits = 0;

		int others = 0;

		//Iterating through each character of inputString

		for (int i = 0; i < input.length(); i++) 
		{
			char ch = input.charAt(i);

			//If ch is in uppercase, then incrementing upperCaseLetters

			if(Character.isUpperCase(ch))
			{
				upperCase++;
			}

			//If ch is in lowercase, then incrementing lowerCaseLetters

			else if(Character.isLowerCase(ch))
			{
				lowerCase++;

			}

			//If ch is a digit, then incrementing digits

			else if (Character.isDigit(ch))
			{
				digits++;
			}

			//If ch is a special character then incrementing others

			else
			{
				others++;
			}
		}

		//Calculating percentage of uppercase letters, lowercase letters, digits and other characters

		double upperCaseLetterPercentage = (upperCase * 100.0) / totalChars ;

		double lowerCaseLetterPercentage = (lowerCase * 100.0) / totalChars;

		double digitsPercentage = (digits * 100.0) / totalChars;

		double otherCharPercentage = (others * 100.0) / totalChars;

		DecimalFormat formatter = new DecimalFormat("##.##");

		//Printing percentage of uppercase letters, lowercase letters, digits and other characters

		System.out.println(input+"' : ");

		System.out.println("Uppercase letters are "+ upperCase + " " +formatter.format(upperCaseLetterPercentage)+"% ");

		System.out.println("Lowercase letters are "+ lowerCase + " " +formatter.format(lowerCaseLetterPercentage)+"%");

		System.out.println("Digits Are "+ digits + " " +formatter.format(digitsPercentage)+"%");

		System.out.println("Other Characters Are "+ others + " " +formatter.format(otherCharPercentage)+"%");

	}

	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string to find the percentage and count: ");
		String value = input.nextLine();
		charPercentage(value);

	}
}




