package One;

public class day5 {

	public static void main(String[] args) {

	// calling the function subA()
		subA();
		subA();
		subA();
	
	// calling the function subB()
		subB(7,2);
		subB(4,4);
		subB(5,2);
		
		System.out.println("--------------------");
		
	// calling the function subC()
		int su = subC(7,3);
		System.out.println(su);
		System.out.println(su-su);
		
	}

	// writing a function without parameter and without return type
	
	public static void subA() {
		
		System.out.println(10-5);
	}
	// writing a function with parameter and without return type
	
	public static void subB(int x, int y) {
		
		System.out.println(x-y);
	}
	// writing a function with parameter and with return type
	
	public static int subC(int x, int y) {
		
		System.out.println(x-y);
		return x-y;
	}
	
	
}
