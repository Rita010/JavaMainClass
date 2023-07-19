package One;

public class day25crev {

	public static void main(String[] args) {

		carA ford = new carA (2);
		System.out.println(ford.wheel);
		ford.brake();
		
		
	}

}
abstract class vehicleA{
	int wheel;
	public vehicleA(int w) {
		this.wheel = w;
	}
	abstract public void brake();
}
class carA extends vehicleA{

	public carA(int w) {
		super(w);
		
	}

	@Override
	public void brake() {
		System.out.println("It is brake for car");
		
	}
	
}