package One;

public class day24constructorInheritanceOverloadingOverridingPvtProt {

	public static void main(String[] args) {
		
		VehicleB b = new VehicleB("Red","Q3",345);
		
		// accessing properties
		
		System.out.println(b.color);
		System.out.println(b.model);
		
		// System.out.println(b.chaseNo);  Private(chaseNo is private so it won't print)
		
		// calling out method();
		
		b.displayColor();
		b.displayChaseNoandModel();
		
		// creating a instance of child class
		
		CarB ford = new CarB("Silver", "m150", 123, "ford");
		
		System.out.println(ford.color);
		System.out.println(ford.model);
		System.out.println(ford.name);
		
		ford.displayChaseNoandModel();
		ford.displayColor();
		
		// over loading
		
		ford.launchDate(2004);
		ford.launchDate(2004, "Jan");
		ford.launchDate(2004, "Jan", 22);
		
		// calling out parent method
		
		ford.greetMsg();
		
		int wheels = ford.displayWheel();
		System.out.println(wheels);
		
		
	}

}
class VehicleB{
	String color;
	String model;
	private int chaseNo;
	
	public VehicleB(String cl, String md, int chaseNo) {
		this.color = cl;
		this.model = md;
		this.chaseNo = chaseNo;			
	}
	public void displayColor() {
		System.out.println(this.color);
	}
	public void displayChaseNoandModel() {
		System.out.println(this.chaseNo);
		this.displayModelNo();
	}
	private void displayModelNo() {
		System.out.println(this.model);
	}
	public void greetMsg() {
		System.out.println("congrats on your new vehicle");
	}
	protected void greetMsg2() {
		System.out.println("congrats on your new vehicle Msg2"); 
	}
}
class CarB extends VehicleB{
		String name;
		private int wheels = 4;
		
	public CarB(String cl, String md, int chaseNo, String nm) {
		super(cl, md, chaseNo);
		this.name = nm;
	}
	// Over loading :same class. same method name, different signature
	
	public void launchDate(int year) {
		System.out.println(year);
	}
	public void launchDate(int year,String month) {
		System.out.println(year);
		System.out.println(month);
	}
	public void launchDate(int year, String month, int date) {
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
	}
	public int displayWheel() {
		return this.wheels;
	}
	// override :same method, same signature, different class(inheritance)


	public void greetMsg() {
		System.out.println("conrats on your new vehicle ford" );
		super.greetMsg();
		this.greetMsg2();
	
	}
	
}








