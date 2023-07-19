package One;

public class day25brev {

	public static void main(String[] args) {
		
		DogD luna = new DogD();
		luna.eat();
		luna.makeSound();
				
	}

}
abstract class AnimalD{
	abstract void makeSound();
	public void eat() {
		System.out.println("Animal loves meat");
	}
}
class DogD extends AnimalD{
	public void makeSound() {
		System.out.println("It can bark loudly");
	}
}