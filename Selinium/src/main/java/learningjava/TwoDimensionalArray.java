package learningjava;

//import java.util.Scanner;

//import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		1. Get the input and stored in the variable

		String nameBlood[][] = {{"Kavitha", "AB+"}, {"Rajesh", "O-"}, {"Nikitha", "A-"}, {"Lakshitha", "A+"}}; 

		//		3.By using loops print the name and blood group

		System.out.println("Using for loop: ");
		System.out.println(" ");

		for (int i = 0; i <=3 ; i++)
		{
			System.out.print(nameBlood[i][0] + " ");
			System.out.println(nameBlood[i][1]);
		}

		System.out.println(" ");
		System.out.println("Using Nested for loop: ");
		System.out.println(" ");

		for(int i = 0; i<=3;i++)
		{
			for(int j=0;j<=1; j++)
			{
				System.out.print(nameBlood[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println("Using foreach loop: ");
		System.out.println(" ");

		for(String[] blood : nameBlood) 
		{
			for(String name1 : blood)
			{
				System.out.print(name1 + " ");
			}
			System.out.println(" ");
		}
	}

}
