package One;
class A{
	public void GreetA() {
		System.out.println("Hello");
	}
	
}
class B{
	public void GreetB() {
		System.out.println("Bye Bye");
	}
}
	class C extends A{  
		// only one class can be inherited in the child class
		
	}
	


public class day26B {

	public static void main(String[] args) {


		C Finance = new C();
		Finance.GreetA();
		
	}	
		
		
	}


