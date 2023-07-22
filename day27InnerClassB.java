package One;

public class day27InnerClassB {

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
	 String CarName;
	 String CarType;
	 
	 public Car(String name, String type) {
		 this.CarName = name;
		 this.CarType = type;
	 }
	 public void Greetings() {
		 System.out.println("Congratulation on new car ".concat(this.CarName));
	 }
	 
	 
	 // Inner class	
	 
	 
 class Engine {
	   String engineSize;
		 
		 // Accessing the outer class fields into inner class
		 
	 public void engineSize() {
			 
			 if(Car.this.CarType.equals("ford")) {
				 this.engineSize = "Smaller";
				 System.out.println(this.engineSize);
			 }
			 else if(Car.this.CarType.equals("BMW")) {
				 this.engineSize = "Bigger";
				 System.out.println(this.engineSize);
			 } 
			 
		 }
	 }
}

