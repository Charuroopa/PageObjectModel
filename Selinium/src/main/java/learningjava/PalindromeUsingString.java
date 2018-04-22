package learningjava;

import java.util.Scanner;

public class PalindromeUsingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String value, reverse = "";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		
		value = input.nextLine();
		
		int length = value.length();
		
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + value.charAt(i);
		
		if(value.equals(reverse))
		{	
			System.out.println(value + " " +"the entered string is palindrome");
		}
		else
		{
			System.out.println(value + " " +"the entered string is not a palindrome");
		}
		input.close();
	}

}
