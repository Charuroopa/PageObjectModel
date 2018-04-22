package learningjava;

import java.util.Scanner;

public class PerfectNumberorNot {

	public static void main(String[] args) {
		int Number, Sum = 0 ;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter any Number: ");
		Number = sc.nextInt();
		sc.close();
		
		for(int i = 1 ; i < Number ; i++) {
			if(Number % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == Number) {
			System.out.format("\n%d is a Perfect Number", Number);
		}
		else {
			System.out.format("\n%d is NOT a Perfect Number", Number);
		}

	}

}
