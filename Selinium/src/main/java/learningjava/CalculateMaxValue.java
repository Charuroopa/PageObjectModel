package learningjava;

import java.util.Scanner;

public class CalculateMaxValue {
	//Assign a value and get the value from user
	public CalculateMaxValue()
	{
		
	}
	void run(String args[])
	{
		System.out.println("Enter the rows and columns: ");
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		int col = input.nextInt();
		int array[][] = new int[row][col];
		
		//input the matrix value
		System.out.println("Enter the matrix: ");
		for( int i = 0; i< row ; i++)
		{	
			for( int j = 0; j < col ; j++)
			{
				array[i][j] = input.nextInt();
				//System.out.print(" ");
			}
		}
		//find the row with max value
		System.out.println("Find the max value of row: ");
		int p = 0, index = 0;
		for (int i = 0; i<row;i++)
		{
			sumRow(array,i,col);
			if(p<sumRow(array,i,col))
			{
				p = sumRow(array,i,col);
				index = i;
			}
		}
		System.out.println (index);
	}
	
	public int sumRow(int array[][], int row, int col)
	{
		int s = 0;
		for (int i = row, j = 0; j<col;j++ )
		{
			s = s+array[i][j];
		}
		return s;
	}
}


