package One;

public class day21c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Son rita = new Son(" subha "," khatiwoda", " swapnil", " rita");
		System.out.println(rita.firstName);
		System.out.println(rita.lastName);
		System.out.println(rita.ffirstName);
		System.out.println(rita.Sname);
		
		rita.displayFName();
		rita.displayGName();
		rita.displaySName();
		
		
	}

}
class Grandfather {
	String firstName;
	String lastName;
	
	public Grandfather(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public void displayGName() {
		System.out.println(this.firstName + this.lastName);
	}
}	

class Father extends Grandfather {
		String ffirstName;
		public Father(String firstName, String lastName, String ffn) {
			super(firstName, lastName);
			this.ffirstName =ffn;
	}
	
		public void displayFName() {
			System.out.println(this.ffirstName + this.lastName);
		}
}

class Son extends Father {
	String Sname;
	public Son(String firstName, String lastName, String ffn, String ssn) {
		super(firstName, lastName, ffn);
		this.Sname = ssn;
	}
	public void displaySName() {
		System.out.println(this.Sname + this.lastName);
	}
}



















