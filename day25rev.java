package One;

public class day25rev {

	public static void main(String[] args) {
	
		SBIbank lalit = new SBIbank();
		lalit.branchName();
		lalit.displayCountry();
		lalit.loan();
		lalit.save();

		CivilBank cvl = new CivilBank();
		cvl.branchName();
		cvl.displayCountry();
		cvl.loan();
		cvl.save();
		
				
	}

}
abstract class worldBankB{
	abstract void loan();
	abstract void save();
	public void displayCountry() {
		System.out.println("I am from Nepal");
	}
}
class SBIbank extends worldBankB{

	@Override
	public void loan() {
		System.out.println("It is  loan section of SBIbank");
		
	}

	@Override
	public void save() {
		System.out.println("It is saving section of SBIbank" );
		
	}
	public void branchName() {
		System.out.println("It is Lalitpur Branch");
	}
}
class CivilBank extends worldBankB{

	@Override
	public void loan() {
		System.out.println("It is loan section of CivilBank");
	}

	@Override
	public void save() {
		System.out.println("It is saving section of CivilBank");
		
	}
	public void branchName() {
		System.out.println("It is Baneshwor Branch");
	}
}

