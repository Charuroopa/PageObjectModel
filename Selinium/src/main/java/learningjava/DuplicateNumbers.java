package learningjava;

public class DuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	1. Assign a value in a variable
		int a[] = {15,26,21,48,72,86,25,87,15,86,72,65,54};

	//2. using loop find the duplicate number

		System.out.println("The duplicate elements are: ");
		for (int i = 0; i<a.length; i++)
		{
		   for (int j = i+1; j<a.length; j++)
		    {
			if(a[i] == a[j])
			{
			   System.out.println(a[j]);
			}
		     }
		}
	}

}
