package One;

public class Exam3page1 {

	public static void main(String[] args) {
		
	//1. Write a function which accepts two int, add them and return int	
	//2. Write a class using construction with two property(fields) and 
	//	1 method and create object of same class	
	//3. Write and example of Multiple level inheritance (a ->b ->c)		
	//4. Write and example of method overriding.
	//5. Write and example of method overloading.
			
			
	//Q. 2. 	Construction
		
		studentB rita = new studentB("Rita","Khatiwoda", 43);

		System.out.println(rita.firstName);
		System.out.println(rita.lastName);
		System.out.println(rita.age);
			
		rita.displayfullName();
		
		
	
	}
	}

class studentB{
	String firstName;
	String lastName;
	int age;
	public studentB(String fn, String ln, int ag) {
		this.firstName = fn;
		this.lastName = ln;	
		this.age = ag;
	}
		public void displayfullName() {
			System.out.println(this.firstName + this.lastName);
			
			
	}	
}






