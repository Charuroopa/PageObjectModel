package learningjava;

//import java.util.Scanner;

public class ArrayOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		1. Get the input and stored in the variable
		String[][] name = {{"Narayanan", "Devima"}, {"abc", "xyz"}, {"rst", "uvw"}, {"efg","hij"},{"Vikram","Rathi"}};

			/*	for(int i=0; i<= name.length;i++)
				{
					System.out.print("The values are: "+ name[i][0] + " ");
					System.out.println(name[i][1]);
				}
		 	*/

		for(int i=0; i<name.length; i++)
		{
			System.out.print("The values are: "+ name[i][0] + " ");

			for (int j =1 ; j<name[i].length; j++)
			{
				System.out.print(name[i][j] + " ");
			}
			System.out.println();
		}

/*		//		2. Get the data from the user
		Scanner name1 = new Scanner(System.in);
		int	n = name1.nextInt();
		int	s = name1.nextInt();

		String[][] values = new String[n][s];
		

		for (int i = 0; i<= n; i++)
		{

			for (int j = 0; j <= s; j++)
			{
				System.out.println("The Values are: " + values[i][j]);

				System.out.println("The array values of the string: " + "[" + i + "][" + j + "]");
				Scanner valString = new Scanner(System.in);
				values[i][j] = valString.next();
				
			}
			valString.close();

		}
		name1.close();
*/
	}
}