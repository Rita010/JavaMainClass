package One;

public class day21d {

	public static void main(String[] args) {
		
		DaughterC Silva = new DaughterC("Mohan ","khatiwoda ","Silva ");
		SonC Subha = new SonC("Mohan "," khatiwoda ","Subha ");
		
		Subha.displayFName();
		Subha.displayName();
		
		Silva.dispalatDName();
		Silva.displayFName();
		
		
	}

}
class FatherC{
	String fistName;
	String lastName;
	
	public FatherC(String fn, String ln) {
		this.fistName = fn;
		this.lastName = ln;
	}
	public void displayFName() {
		System.out.println(this.fistName + this.lastName);
	}
}
class SonC extends FatherC {
	String Sname;
	public SonC(String fn, String ln, String sn) {
		super(fn, ln);
		this.Sname = sn;	
	}
	public void displayName() {
		System.out.println(this.Sname + this.lastName);
	}
}

class DaughterC extends FatherC{
	String Dname;
	public DaughterC(String fn, String ln , String dn) {
		super(fn, ln);
		this.Dname = dn;
	}
	public void dispalatDName() {
		System.out.println(this.Dname + this.lastName);
	}
}

































