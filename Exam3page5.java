package One;

public class Exam3page5 {

	public static void main(String[] args) {

		//5. Write and example of method overloading.
		
		additionAA(2,3);
		additionAA(2,3,4);
		additionAA(2,3,4,5);
			
		
	}
// overloading - same class, same methodName, different signature
	
	// method 1
	public static void additionAA(int x, int y) {
		System.out.println(x+y);
	}
	
	// method 2
	public static void additionAA(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	
	// method 3
	public static void additionAA(int x, int y,int z, int a) {
		System.out.println(x+y+z+a);
	}
}

