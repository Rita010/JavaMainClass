package One;

public class day3callingCalculatorFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// program 1
		
		// to print "hello"
		
		System.out.println("hello");
		
		
		// program 2
		
		// arithmetic operator
		
		int x = 5;
		int y = 2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
		
		int a = 8;
		int b = 4;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
			
		// Calling the calculator function
		calculator(9,3);
		calculator(8,2);
		
		
	}

	public static void calculator(int x , int y) {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
	}
	
	
}
