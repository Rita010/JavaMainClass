package One;

public class day23a {

	public static void main(String[] args) {
	
	Dog d = new Dog();
	d.displayMessage();
		
	

	}

}
// use of super keyword in java
class Animal{
	public void display() {
		System.out.println("It is an animal");
	}
}
class Dog extends Animal{
	public void display() {
		System.out.println("It is a dog");
	}
	public void displayMessage() {
		super.display();
	}
}








