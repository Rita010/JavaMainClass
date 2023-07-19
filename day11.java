package One;

public class day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Extrovert / Introvert
		// loud  /  Calm
		 
		// Human
		// properties - age, height, color
		// Method - walk () , talk ()
		
		// Vehicle
		// properties - model, color, regNo
		// Methods - start () , stop ()
		
		// Bank 
		// properties - accNo, branch, bal
		// Methods - deposit(), withdrawal ()
		
		
		//int a = 10 ----  -12 12 0
		
		//String ------- properties and methods
		
		// How to defined String? 
		
		// program 1
		// Define String work
		
		String name = "rita";
		System.out.println(name);
		
		
		// program 2
		// print charAt();
		
		// 0 1 2 3
		// r i t a
		
		// String is collection of characters
		// String stores the value by Index
			
		
		// charAt();
		
		char thirdChar = name.charAt(3);
		System.out.println(thirdChar);
		
		// length()
		// action - count total number of char
		// return - int
		
		
		// program 3
		// length()
		
		// 0 1 2 3 4 5 6 7 8
		// K h a t i w o d a
		
		String lastName = "Khatiwoda";
		int totalChar = lastName.length();
		System.out.println(totalChar);
		
		
		// length -1 is always the last index
		
		// program 4
		
		String fatherName = "Mohan";
		int totalC = fatherName.length();
		System.out.println(totalC);
		
		for(int i = 0 ; i < totalC ; i++) {
			
		}
		//System.out.println(i);
		//System.out.println(fatherName.chaAt(i);
		
		// i = 0
		// i = 1
		// i = 2
		// i = 3
		// i = 4
		
		
		// program 5
		
		String city = "Glendale";
		
		// 0 1 2 3 4 5 6 7 
		// G l e n d a l e 
		
		for(int i = 0 ; i < city.length(); i++){
			//system.out.println(i)
			System.out.println(city.charAt (i));
		}
		
		// program 6
		// print every char in reverse order
		
		for(int i = city.length()-1 ; i >= 0; i--) {
			System.out.println(city.charAt(i));
		}
		// i -----7
		// i -----6
		// i ---- 5
		// i -----4
		// i -----3
		// i -----2
		// i -----1
		// i -----0
		
		
		// program 7
		//Upper case
		
		String city2 = "Glendale";
		String upperCaseString = city2.toUpperCase();
		System.out.println(upperCaseString);
		
		
		// program 8
		// lower Case
		
	String city3 = "CHAndler";
	String lowerCaseString = city3.toLowerCase();
	System.out.println(lowerCaseString);
		

	// program 9
	// Reverse output in a Horizontal line
	
	String city5 = "Glendale";
	String reveAddress = "";
	
	for(int i = 0; i < city.length(); i++) {
		reveAddress = city5.charAt(i)+ reveAddress;
	}
	System.out.println(reveAddress);

	
	//
	String city6 = "Glendale";
	String reverseCity = "";
	for(int i = 0 ; i < city.length(); i++) {
		reverseCity = city5.charAt(i)+ reverseCity; }
		System.out.println(reverseCity);

	
	
		String City7 = "Phoenix";
		
	}
	
	
	}
		
	
	
		
	

