package learningjava;

import java.util.Scanner;

public class PrimeNotPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		1. Assign a variable using data type
		Scanner pnum = new Scanner(System.in);
		int i = 2 ,num1 = 0;// temp = 0;
		boolean isPrime = true;
	//	String primeNumber = " ";
		//	2. Get the input from the user
		System.out.println("Enter the number:");
		num1 = pnum.nextInt();
		pnum.close();
		//	3. By using loops and condition statement need to get the output 

/*		for(i = 2 ; i<=num1/2; i++)
		{
			
			temp = num1%i;
			if(temp==0)
			{
				isPrime=false;
				break;
			}	
		}
			//if (temp == 2)
				//primeNumber = primeNumber + i + " ";
		//}
*/

		while(i<=num1/2)
		{
			if(num1%i == 0)
			{
				isPrime = false;
				break;
			}
			i++;
		}

		//	4. Print the output

		if(isPrime)
		System.out.println(num1 + " is a Prime Nubmer");
		else
		System.out.println(num1 + " is not a Prime Nubmer");
		

	}

}
