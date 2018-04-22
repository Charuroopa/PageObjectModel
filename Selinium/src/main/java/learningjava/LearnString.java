package learningjava;

public class LearnString {

	String str1="TestLeaf Java";
	String str2="TestLeaf Java";
	String str3[]= {"TestLeaf java"};
	String str4[]= {"testleaf java"};
	String str5[]= {"Java"};

	//public static void main(String[] args) {
	public void learnString() {
		if(str1.equals(str2)) {
			System.out.println("The given strings are equal");
		}
		if(str1.contains("estL")) {
			System.out.println("estL is contained in TestLeaf Java");
		}
		int len=str1.length();
		System.out.println("The length of STR1"+len);
		
		if(str1!=str2) {
			System.out.println("the strings are not equal as expected");
		}
		else
			System.out.println("The given strings are equal");

		/*if(str1.equalsIgnoreCase(str3)) {
			System.out.println("Error because equals ignore case accepts String as an argument");
		}*/
		/*if(str1==str3) {
		System.out.println("Error because equals ignore case accepts String as an argument");*/
		
		if(str3==str4) {
			System.out.println("String arrays are equal with relational operator");
		}
		else
			System.out.println("String arrays are unequal with relational operator");
		
		
		if(str4!=str5) {
			System.out.println("String arrays are unequal with relational operator");
		}
		else
			System.out.println("String arrays are equal with relational operator");


		if(str3.equals(str4)) {
			System.out.println("equal");
		}
		else
			System.out.println("not equal");
	
	}

	public static void main(String args[]) {
		LearnString obj1=new LearnString();
		obj1.learnString();

	}

}
