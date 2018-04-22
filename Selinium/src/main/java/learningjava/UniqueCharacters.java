package learningjava;

import java.util.Scanner;

public class UniqueCharacters {


	 boolean uniqueCharacters(String word) {
		// TODO Auto-generated method stub

		//3.  If at any time we encounter 2 same characters, return false
		String temp = "";

		for (int i = 0; i < word.length(); i++){
			char current = word.charAt(i);
			if (temp.indexOf(current) < 0){
				temp = temp + current;
			}
			else {
				temp = temp.replace(String.valueOf(current), "");
			}
		}
			System.out.println(temp + " ");
		
		for (int i=0; i<word.length(); i++) {
			for (int j=i+1; j<word.length(); j++)
				if (word.charAt(i) == word.charAt(j))

					return false;

		}
		//4. If no duplicate characters encountered, return true
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Get the string from user
		Scanner unique = new Scanner (System.in); 
		String word = "";

		System.out.println("Enter a word: ");
		word = unique.nextLine();
		UniqueCharacters obj = new UniqueCharacters();

		//uniqueCharacters(word); 
		//2. Check the string value using condition 
		if (obj.uniqueCharacters(word))
			System.out.println("The String " +
					word + " has all unique characters");
		else
			System.out.println("The String " +
					word + " has duplicate characters");
		unique.close();
	}


}
