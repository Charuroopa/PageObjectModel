package learningjava;

import java.util.Scanner;

public class AscendingOrderWithoutDuplicates {

	public static void duplicateElements(int array[])
	{
	  
    for(int i=0;i<array.length;i++){
        boolean isDistinct = false;
        for(int j=0;j<i;j++){
            if(array[i] == array[j]){
                isDistinct = true;
                break;
            }
        }
        if(!isDistinct){
            System.out.print(array[i]+" ");
        }
    }
}
	public static void main(String args[])
	{
		//Assign a variable and value . get input from the scanner.
		
		int value, temp;
		
		System.out.println("Enter number of elements needs to be entered in an array: ");
		
		Scanner s = new Scanner(System.in);
		
		value = s.nextInt();
		
		int array[] = new int[value];
		//By using value use the loop and get the elements in array
		System.out.println("Enter the elements: ");
		
		for(int i = 0; i < value; i++)
		{
			array[i] = s.nextInt(); 
		}
		for(int i = 0; i < value; i++)
		{
			for (int j = i + 1; j < value; j++ )
			{
				if(array[i] > array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		//Sort the array value in ascending order by using the for loop and get the values -1 since the value gets decreased
		System.out.println("Ascending order : ");
		
		/*for(int i = 0; i < value; i++)
		{
			System.out.print(array[i] + " ");
		}*/
		//System.out.println(array[value - 1]);
		AscendingOrderWithoutDuplicates.duplicateElements(array);
	}
}
