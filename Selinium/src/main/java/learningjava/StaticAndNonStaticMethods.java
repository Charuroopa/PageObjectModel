package learningjava;

public class StaticAndNonStaticMethods {

		static int a = 50;
		String s = "Madhu";
		
		static void sFunction()
		{
			System.out.println("Print values from static function");
			System.out.println("The integer value is: " + a);
			
		}
		
		void nsFunction()
		{
			System.out.println("Print the values from non static function");
			System.out.println("The String value is: " + s);
			System.out.println("The integer value is: " + a);
			//Calling static method in non static method
			sFunction();
		}
		
		public static void main(String args[]) {
		
			
			System.out.println("Calling static and non static function in main method");
			sFunction();
			
			StaticAndNonStaticMethods obj = new StaticAndNonStaticMethods();
			obj.nsFunction();
			
		}
}
