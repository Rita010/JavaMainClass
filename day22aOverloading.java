package One;

public class day22aOverloading {

	public static void main(String[] args) {

		// Polymorphism - Polymorphism is one of the core concepts of object-oriented
		//programming (OOP) and describes situations in which something
		//occurs in several different forms. In computer science, it describes
		//the concept that you can access objects of different types through
		//the same interface. Each type can provide its own independent
		//implementation of this interface.
		
		
		additionA(2, 4);
		additionA(2, 4, 6);
		additionA(2, 4, 6, 8);

	}
	// over loading - same class, same methodName, different signature

	// Method 1

	public static void additionA(int x, int y) {
		System.out.println(x + y);
	}

	// Method 2

	public static void additionA(int x, int y, int z) {
		System.out.println(x + y + z);
	}
	// Method 3

	public static void additionA(int x, int y, int z, int a) {
		System.out.println(x + y + z + a);
	}

}
