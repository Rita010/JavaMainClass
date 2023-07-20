package One;

public class day27A {

	public static void main(String[] args) {


		
		
		
		CPU i7 = new CPU ();
		System.out.println(i7.price);
		int priceD = i7.displayPrice();
		System.out.println(priceD);
		
		CPU.Processor Pro = i7.new Processor();
		CPU.Processor Pro2 = i7.new Processor();
		
		System.out.println(Pro.manufacturer);
		System.out.println(Pro.speed());
		
	
		

	}

}
class CPU {
	int price = 1000;
	
	class Processor {
		String manufacturer = "Intel";
		
		public String  speed() {
			return "fast";
		}
		
	}
	
	public int displayPrice() {
		return this.price;
	}
	
	
	
	
	
}