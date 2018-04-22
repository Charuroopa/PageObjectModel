package learningjava;

import java.util.Scanner;

public class Matrixof4 {

	public static void main(String args[]){
		
	
	//1. Assign a variable
	int i,j;
	
//2. Get the input from scanner
	System.out.println("Enter the rows and columns: ");
	Scanner matrix = new Scanner(System.in);
	int row = matrix.nextInt();
	int column = matrix.nextInt();
	int array[][] = new int[row][column];
//3. By using for loop we can print the matrix
	System.out.println("Enter the matrix: ");
	for( i = 0; i< row ; i++)
	{	
		for( j = 0; j < column ; j++)
		{
			array[i][j] = matrix.nextInt();
			//System.out.print(" ");
		}
	}
	System.out.println("The 4*4 matrix is: ");
	
	for( i = 0; i< row ; i++)
	{	
		for( j = 0; j < column ; j++)
		{
			System.out.print(array[i][j] + " ");
		}
	System.out.println(" ");
	}
	spiralPrint(row, column, array);
	
	}
	 static void spiralPrint(int row, int column, int array[][])
	    {
	        int i, k = 0, l = 0;
	        /*  k - starting row index
	        m - ending row index
	        l - starting column index
	        n - ending column index
	        i - iterator
	        */
	          
	        while (k < row && l < column)
	        {
	            // Print the first row from the remaining rows
	            for (i = l; i < column; ++i)
	            {
	                System.out.print(array[k][i]+" ");
	            }
	            k++;
	  
	            // Print the last column from the remaining columns 
	            for (i = k; i < row; ++i)
	            {
	                System.out.print(array[i][column-1]+" ");
	            }
	            column--;
	  
	            // Print the last row from the remaining rows */
	            if ( k < row)
	            {
	                for (i = column-1; i >= l; --i)
	                {
	                    System.out.print(array[row-1][i]+" ");
	                }
	                row--;
	            }
	  
	            // Print the first column from the remaining columns */
	            if (l < column)
	            {
	                for (i = row-1; i >= k; --i)
	                {
	                    System.out.print(array[i][l]+" ");
	                }
	                l++;    
	            }        
	        }
	    }
	     

	
}
