package One;

public class SingletonPractice {

	public static void main(String[] args) {
		
		
		wednesday rit;
		rit=wednesday.getDispaly();
		rit.getConnection();
		
		//System.out.println(rit.str);
	}

}
class wednesday{
	private static wednesday wed = null; // object created
	// properties
	  //String str; 
	  // default constructor
	  private wednesday() {
	  //str = "welcome to Glendale";
	  }
	 //Method with return
	 public static wednesday getDispaly() {
	
		if(wed == null) {			// condition check
			wed = new wednesday();// create object
		}
		return wed;	 
	}
	 // method for call in main
	 public void getConnection() {
		 System.out.println("Today is wednesday");
	 }	 
}