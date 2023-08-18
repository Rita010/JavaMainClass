package One;

class MyException extends Exception{
	
	// the inherited class Exception is predefined class
	
	public MyException(String s) {
		
		// call the constructor of parent Exception 
		
		super(s);
	}
	
}

class InvalidMobileNumber extends Exception{
	public InvalidMobileNumber(String s) {
		
		//call constructor of parent Exception
		super(s);
	}
}
// A class that uses above MyException






public class main {
	
	// Driver program
	
	public static void main(String[] args) {
		 
		try { 
			String password = "newStrongPassword";
			if(password.length()<=8) {
				
			//throw is used to write that message should be displayed so catch key word can display this message in runtime 
			// new keyword is used to create new object of class MyEcception.
				
				throw new MyException("password length is small");
	
			}
			
			String mobileNumber = "1234567890";
			
			if(mobileNumber.length()<=10) {
				throw new InvalidMobileNumber("please enter correct mobile");
			}
			System.out.println("user registered");
			
		}catch (Exception e) {
			
			System.out.println("function called");
			System.out.println("caught");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
			
	}

}
