package One;

public class Exam4page5 {

	public static void main(String[] args) {
	
		// 7. one program for overriding
		
		NIB77 b = new NIB77("Nepal", "Baneshwor");
		b.displayMessage();
		b.loan();
		b.save();
				
		CivilBank77 c = new CivilBank77 ("Nepal", "Kathmandu");
		c.loan();
		c.save();
	}

}
class WorldBank7{
	String Kathmandu;
	public WorldBank7(String ktm) {
		this.Kathmandu=ktm;
	}
	public void loan() {
		System.out.println("loan");
	}
	public void save() {
		System.out.println("save");
	}
	public void displayMessage() {
		System.out.println("welcome to worldBank");
	}
}
class CivilBank77 extends WorldBank7{
	String BranchName;
	public CivilBank77(String ktm, String bn) {
		super(ktm);
		this.BranchName=bn;
	}
	public void loan() {
		System.out.println("civil bank loan");
	}
	public void save() {
		System.out.println("civil bank save ");
	}
}
class NIB77 extends WorldBank7{
	String BranchName;
	public NIB77(String ktm, String bnn) {
		super(ktm);
		this.BranchName= bnn;
	}
	public void loan() {
		System.out.println("This is loan form Baneshwor NIB");
	}
	public void save() {
		System.out.println("This is save from Baneshwor NIB");
	}
}


