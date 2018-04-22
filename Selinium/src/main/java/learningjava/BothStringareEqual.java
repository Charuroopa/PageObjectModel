package learningjava;

import java.util.Scanner;

public class BothStringareEqual {

	public static void main(String[] args) {
		String str1=null;
		String str2=null;

		Scanner SC=new Scanner(System.in);

		System.out.print("Enter string1: ");
		str1=SC.nextLine();
		int str1input = str1.length();
		System.out.println("The length of first string is: " + str1input);

		System.out.print("Enter string2: ");
		str2=SC.nextLine();	
		int str2input = str2.length();
		System.out.println("The length of second string is: " + str2input);

		SC.close();

		//compare strings
/*
		if (str1.length()==str2.length())
		{
			System.out.println(true);
		}

		else
		{
		System.out.println(false);
		}
*/
		boolean flg=true;

		for(int i=0; i<str1.length();i++){
			if(str1.charAt(i)!=str2.charAt(i)){
				flg=false;
				break;
			}
		}

		if(flg){
			System.out.println(str1 + " is " + flg);
		}
		else{
			System.out.println(str2 + " is " + flg);
		}


	}

}
