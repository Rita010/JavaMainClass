package One;
interface WB{
	public void Save();
	public void Loan();
	
}
interface WBA{
	public void DisplayCounrty();
	public void DisplayCity();
	
}
public class day26C {

	public static void main(String[] args) {
		
		
		
		Bank ktm = new Bank();
		ktm.DisplayCity();
		ktm.DisplayCounrty();
		ktm.Save();
		ktm.Loan();
	
		
		
	}

}
class Bank implements WB, WBA{    // more than one interface can be implemented by class

	
	public void DisplayCounrty() {
		System.out.println("This is of Nepal");
		
		
	}

	public void DisplayCity() {
		System.out.println("Kathmandu");
		
		
	}

	public void Save() {
		System.out.println("Save method");
		
		
	}


	public void Loan() {
		System.out.println("Loan method");
		
		
	}
	
}