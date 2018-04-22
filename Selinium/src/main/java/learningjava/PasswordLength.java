package learningjava;

import java.util.Scanner;

public class PasswordLength {

	public static void main(String[] args) {
		
	//	1. Get the value from the user input.

		Scanner password = new Scanner(System.in);
		System.out.println("Enter the password: ");
		String valid = password.nextLine();
		
		if (isValidPassword(valid))
		{
			System.out.println("Password is valid: " + valid);
		}
		else
		{
			System.out.println("Password is not valid: " + valid);
		}
		password.close();
	
}
	//2. Check the input by using loop and if condition in a method
	public static boolean isValidPassword(String password) {

        if (password.length() < 10) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (isNumeric(ch)) numCount++;
            else if (isLetter(ch)) charCount++;
            else return false;
        }


        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean isLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean isNumeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }

}
