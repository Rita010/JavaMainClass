package One;

public class day27B {

	public static void main(String[] args) {

		Car ford = new Car ("m150","ford");
		Car BMW = new Car ("x5", "BMW");
		
		Car.Engine i = ford.new Engine();
		Car.Engine k = BMW.new Engine();
		
		i.engineSize();
		k.engineSize();
			

	}

}

class Car {
	 String carName;
	 String carType;
	 
	 public Car(String name, String type) {
		 this.carName = name;
		 this.carType = type;
	 }
	 public void Greetings() {
		 System.out.println("Congratulation on new car ".concat(this.carName));
	 }
	 
	 
	 // Inner class	
	 
	 
 class Engine {
	   String engineSize;
		 
		 // Accessing the outer class fields into inner class
		 
	 public void engineSize() {
			 
			 if(Car.this.carType.equals("ford")) {
				 this.engineSize = "Smaller";
				 System.out.println(this.engineSize);
			 }
			 else if(Car.this.carType.equals("BMw")) {
				 this.engineSize = "Bigger";
				 System.out.println(this.engineSize);
			 } 
			 
		 }
	 }
}

