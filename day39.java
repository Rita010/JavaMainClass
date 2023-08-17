package One;

public class day39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dog2 d = new Dog2();
		
		System.out.println(d instanceof Dog2);
		System.out.println(d instanceof Animal2);
		
		
		Invoice inv = new Invoice("123", "rita", "khatiwoda", "6232748286", "Phoenix");
		System.out.println(inv instanceof Invoice);
		
		
	}

}
class Animal2{
	
}
class Dog2 extends Animal2{
	
}
class Invoice{
	String billNo; 
	String firstName;
	String lastName;
	String phoneNo;
	String Address;
	
	public Invoice(String bn, String fn, String ln, String pn,String add) {
		
		this.billNo   = "123";
		this.firstName = "rita";
		this.lastName = "khatiwoda";
		this.phoneNo = "12345";
		this.Address = "123";
		
		
		
	}
	 
}
















