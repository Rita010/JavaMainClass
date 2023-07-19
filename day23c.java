package One;

public class day23c {

	public static void main(String[] args) {

		Humanc c = new Humanc(123);
		System.out.println(c.ssN);
		
		StudentEE e = new StudentEE(1234);	
		
		
	}

}
class Humanc {
	protected int ssN;
	public Humanc(int ssn) {
		this.ssN=ssn;
	}
}
class StudentEE extends Humanc{
	public StudentEE(int ssn) {
		super(ssn);
	}
	public void displayssN() {
		System.out.println(this.ssN);
	}
}