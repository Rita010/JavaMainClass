package One;

public class day25c {

	public static void main(String[] args) {

		carK ford = new carK (4);
		System.out.println(ford.wheel);
		ford.brake();
			

	}

}
abstract class VehicleK{
	int wheel;
	public VehicleK(int w) {
		this.wheel = w;
	}
	abstract public void brake();
}
class carK extends VehicleK{

	public carK(int w) {
		super(w);
		
	}
	public void brake() {
		System.out.println("It is a brake for car");
	}
	
	}
	
	

	
	
	
	
	
	