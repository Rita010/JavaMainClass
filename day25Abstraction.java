package One;

public class day25Abstraction {

	public static void main(String[] args) {
		
	// you cannot create the object of abstract class
		//worldBankA a = new worldBank();
		
		SBIA pune = new SBIA();
		pune.loan();
		pune.save();
		pune.displayCountry();
		pune.branchName();
		
		
		
	}

}
abstract class worldBankA{
	
	// abstract method
	
	abstract void loan();
	abstract void save();
	public void displayCountry() {
		System.out.println("I am from Nepal");
	}
}
// you cannot create object of abstract class

class SBIA extends worldBankA{
	public void loan() {
		System.out.println("It is loan from Sbi");
	}
	public void save() {
		System.out.println("It is save form sbi");
	}
	public void branchName() {
		System.out.println("It is pune branch");
	}
}
class PNBA extends worldBankA{
	
	public void loan() {
		System.out.println("It is loan form pnba");
	}
	public void save() {
	System.out.println("It is save form pnba");
	
	}
	public void branchName() {
		System.out.println("It is a pune branch pnba");
	}
}





















