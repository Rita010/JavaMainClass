package One;

public class Day4 {

	public static void main(String[] args) {

		// calling the addA()function 
		
		addA();
		addA();
		addA();
		
		// calling the addB() function
		addB(5,2);
		addB(3,3);
		
		// calling the addC() function
		int sum = addC (7,2);
		System.out.println(sum);
		System.out.println(sum+sum);
		System.out.println(sum-2);
		System.out.println(sum*0.10);

	}
	
	// writing a function without parameter and without return type
	
	public static void addA() {
		System.out.println(9 + 9);
	}
	// writing a function with parameter and without return type
	
	public static void addB(int x , int y) {
		System.out.println(x+y);
	}
	// writing a function with parameter and with return type
	
	public static int addC(int x, int y) {
		System.out.println(x+y);
		return x+y;
	}
	
	
}
