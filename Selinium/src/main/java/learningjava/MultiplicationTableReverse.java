package learningjava;

import java.util.Scanner;

public class MultiplicationTableReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Get the input and store in variable
		int table;
//		int table = 2;
		Scanner mul = new Scanner(System.in);
		table = mul.nextInt();
		mul.close();
		
//	2. Repeat the following steps using for
		for(int i =10; i>=1; i--)
		{
//			table = i*2;
//			System.out.println(i + " *2 = " + (i*2));
			System.out.println(i + " * " + table +" = " +(i*table));
		}
		
	/*	
	  int i = 1;
		while(i<=10)
		{
			System.out.println(i + " *2 = " + (i*2));
			i = i+1;
//			i++; i+=1
		}
		*/
	}

}
