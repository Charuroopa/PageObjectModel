package learningjava;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		1. Assign the variable
		int num, a, sum =0;

		System.out.println("Enter the Amstrong values from 100 to 1000: ");
		//	2.Use the for loop to find the values from 100 to 1000

		for (int i = 100 ; i <= 1000 ; i++)
		{

			num = i;

			while(num>0)
			{
				a = num %10;
				sum = sum + (a*a*a);
				num = num/10;
			}
			if (sum == i)
			{
				System.out.println(i + " ");
			}

			sum = 0;
		}
	
	}

	/*	in this in sum we will perform cube for each value. 
	and the reminder will be assigning in a since for a we ae going to perform cube root 
	and find the values one by one.

	Finally again we have to assing sum = 0; since once completing the while loop 
	the sum should start from 0 then only we able to find the respective values from 100 to 1000*/ 
}


