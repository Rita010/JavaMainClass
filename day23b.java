package One;

public class day23b {

	public static void main(String[] args) {


		AnimalB cat = new AnimalB(6);
		cat.displayAge();
		int q1 = cat.updageAgee(10);
		
		System.out.println(q1);
		
		cat.displayMessage();
		
		

	}

}
class AnimalB {
	
	private int age;
	public AnimalB(int ag) {
		this.age = ag;
	}
	
	// method returning string
	
	private String displayName() {
		return "It is a dog";
	}
	
	public void displayAge() {
		System.out.println(this.age);
	}
	// methods returning int
	
	public int updageAgee (int updateAgee) {
		this.age = updateAgee;
		return this.age;
	}
	
	public void displayMessage() {
		String msg = displayName();
		System.out.println(msg);
	}
	
	
	
	
	
	
	
	
	
}