package One;

public class day25b {

	public static void main(String[] args) {

		DogB s= new DogB();
		s.makeSound();
		s.eat();
		
		
		
	}

}
abstract class AnimalC{
	abstract void makeSound();
	public void eat() {
		System.out.println("It can eat");
	}
}
class DogB extends AnimalC{
	public void makeSound() {
		System.out.println("It can bark ");
	}
}