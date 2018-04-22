package learningaccessmodifiers;

public class ClassB extends ClassA {


	public void inputvar(int age, String name,String gender) {


		ClassA obj1= new ClassA();
		obj1.a(age);
		obj1.nam(name);
		//ClassA.gen(gender);
	}

	public void inputvar(String name, String gender) {
		int a=2,b=3;
		int sum=a+b;
		System.out.println("Return type: "+sum);
		ClassA obj2=new ClassA();
		obj2.nam(name);
		obj2.a(sum);
		
	}
	
	/*public static void main(String args[]) {
		ClassB b= new ClassB();
		b.inputvar("xyz","F");
		b.inputvar(2, "abc", "gender");
	}
*/




}
