package learningjava;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNumber = 4232;
		int sumOfDigits = 0, reminder;
		int number = inputNumber;
		
		while(inputNumber != 0)
		{
			reminder = inputNumber%10;
			sumOfDigits = sumOfDigits + reminder;
			inputNumber = inputNumber/10;
		}
		System.out.println("Sum of Digit " + number + " is " + sumOfDigits);
	}

}
