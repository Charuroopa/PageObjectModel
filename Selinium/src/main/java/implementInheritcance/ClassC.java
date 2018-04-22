package implementInheritcance;

import learningaccessmodifiers.ClassA;
import learningaccessmodifiers.ClassB;

public class ClassC extends ClassB {
	
	public void inputvar(String name, String gender) {
		int a=4,b=5;
		int sum=a*b;
		ClassA obj2=new ClassA();
		obj2.nam(name);
		obj2.a(sum);
		System.out.println("Tha age is"+sum+ "Method overriding concept");
		
	} 
	

	public static void main(String[] args) {
		ClassB obj1=new ClassB();
		obj1.inputvar("name", "gender");
		obj1.inputvar(2, "abc","f" );
		ClassC obj2=new ClassC();
		obj2.inputvar("xyz", "f");
		
	
		// TODO Auto-generated method stub

	}

}
