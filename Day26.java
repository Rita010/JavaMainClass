package One;
interface worldBank{
	
	public void Save(int x);
	public void Loan(int y);
}
public class Day26 {

	public static void main(String[] args) {
		
		
		
		SBI Nepal = new SBI ();
		Nepal.Loan(0);
		Nepal.Save(0);
		
		
		Civil Nepal2 = new Civil();
		Nepal2.Loan(0);
		Nepal2.Save(0);

			

	}

}
class SBI implements worldBank{

	
	public void Save(int x) {
		System.out.println("This is save method for SBI");
		
	}

	public void Loan(int y) {
		System.out.println("This is loan method for SBI");
		
	}
	
}
class Civil implements worldBank{


	public void Save(int x) {
		System.out.println("This is save method for Civil");
		
	}

	
	public void Loan(int y) {
		System.out.println("This is loan method for Civil");
		
	}
	
}