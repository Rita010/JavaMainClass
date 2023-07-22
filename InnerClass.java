package One;


public class InnerClass {
	

	// Encapsulation is to make sure that sensitive data is hidden from user.
	// declare class variables/attributes as private
	// provide public get and set methods to access and update the value of a private variable
	
	// to achieve this:

	// The get method returns the variable value, and the set method sets the vale


	public static void main(String[] args) {
		
	}

}
class Costco{
	String CustomerName, MembershipType;
	// constructor
	public Costco(String cn, String mem) {
		this.CustomerName = cn;
		this.MembershipType = mem;
	}
	// method
	private String displayMemberName()	{
		return this.CustomerName;
	}
	// Child class
	class Membership{
		String MemberType;
		void setMembership() {  //set method sets the value
		if(Costco.this.MembershipType.equals("Platinum"))	{
			this.MemberType = "10% discount";
		}
		else	
		{
			this.MemberType = "2% discount";
		}
		
	
	}
	}
		
	}

	
