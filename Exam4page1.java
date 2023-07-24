package One;

public class Exam4page1 {

	public static void main(String[] args) {

// 1. one program on inheritance multilevel
		
		Son7 roshan = new Son7("BishnuBhakta", "Khatiwoda", "Mohan", "Roshan");	
		roshan.displayFullName();
		roshan.displaysfullName();
		
		Father7 mohan = new Father7("BishnuBhakta", "Khatiwoda", "Mohan");
		mohan.displayffullName();
		

	}
}
class Grandfather7{
	String firstName;
	String lastName;
	public Grandfather7(String fn, String ln) {
		this.firstName=fn;
		this.lastName=ln;
	}
	public void displayFullName() {
		System.out.println(this.firstName+this.lastName);
	}
}
class Father7 extends Grandfather7{
	String ffirstName;
	public Father7(String fn, String ln, String ffn) {
		super(fn, ln);
		this.ffirstName= ffn;
	}
	public void displayffullName() {
		System.out.println(this.ffirstName+this.lastName);
	}
}
class Son7 extends Father7{
	String sfirstName;
	public Son7(String fn, String ln, String ffn, String sfn) {
		super(fn, ln, ffn);
		this.sfirstName=sfn;
	}
	public void displaysfullName() {
		System.out.println(this.sfirstName+this.lastName);
	}
}



