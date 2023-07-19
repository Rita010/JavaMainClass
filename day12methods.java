package One;

public class day12methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Methods
		
		// Program 1
		// Upper Case
		
		
		String city1 = "Glandale";
		String uc = city1.toUpperCase();
		System.out.println(uc);
		
		
		// Program 2
		// Lower Case
		
		
		String city2 = "CHanDleER";
		String lc = city2.toLowerCase();
		System.out.println(lc);
		
		
		
		// Program 3
		// Length
		
		String city3 = "Surprise";
		int toc = city3.length();
		System.out.println(toc);
		
		
		// Program 4
		
		
		String city4 = "Deervalley";
		int toc2 = city4.toUpperCase().toLowerCase().length();
		System.out.println(toc2);
		
		
		// program 5
		// Character at End
		
		String city5 = "Phoenix";
		char c = city5.charAt(city5.length()-1);
		System.out.println(c);
		
		
		//Program 6
		//Substring
		
		// 0 1 2 3 4 5 6
		// p h o e n i x 
		
		String city6 = "Phoenix";
		String s1 = city6.substring(3);
		System.out.println(s1);
		
		
		String s2 = city6.substring(1,3);
		System.out.println(s2);
		
		
		// Exercise done on 19th June
		
		
		// Program 1
		// StartsWith Method()
		 
		String city7 = "Glendale";
		boolean s3 = city7.startsWith("G"); // true
		System.out.println(s3);
	
		boolean s4 = city7.startsWith("e"); // false
		System.out.println(s4);
		
		
		// Program 2
		// EndsWith Method()
		
		String city8 = ("Glandale");
		boolean s5 = city8.endsWith("le"); // true
		System.out.println(s5);
		
		boolean s6 = city8.endsWith("gl"); // false
		System.out.println(s6);
				
	
		// Program 3 
		// Replace First Method
		
		String city9 = ("I am learning Python and Python is a good language");
		String s7 = city9.replaceFirst("Python","java");
		System.out.println(s7);
		
		// Program 4
		// Replace all Method
		
		String s8 = city9.replaceAll("Python", "Java");
		System.out.println(s8);
		
		// Program 5 
		// replace()
		
		String s9 = city9.replace("I", "M");
		System.out.println(s9);
		
		
		// Program 6
		// Join two Strings 
		
		String city10 = "Glandale";
		String city11 = "Welcome to ";
		String s10 = city11.concat(city10);
		System.out.println(s10);
		
	
		
		// Program 7
		// contains()
		
		String city12 = "I am studying Java in Glendale";
		boolean s11 = city12.contains("studying");     // true
		System.out.println(s11);
		
		boolean s12 = city12.contains("learning");     // false
		System.out.println(s12);
		
		
		
		// Program 8
		// Equal ()
		
		String city13 = "HappyValley";
		String city14 = "DeerValley";
		boolean s13 = city13.equals(city14);  // false
		System.out.println(s13);
				
		
		String city15 ="HappyValley";
		boolean s14 = city13.equals(city15);   // true
		System.out.println(s14);
				
		
		// Program 9
		// Equal IgnoreCase()
		
		String city16 = "Phoenix";
		String city17 = "PHOENIX";
		boolean s15 = city16.equalsIgnoreCase(city17);  // true
		System.out.println(s15);
		
		
		// Program 10
		// Trim()
		
		String city18 = " I am learning Java ";
		System.out.println(city18.length());
		
		String s16 = city18.trim();
		System.out.println(s16.length());
		
		
		// Program 11
		// Contains
	
		
		String city19 = "I am learning Japanese";
		String city20 = "JAPANESE";
		boolean s17 = city19.toUpperCase().contains(city20);   // true
		System.out.println(s17);
		
		
		String city21 = "I am learing French";
		String city22 = "French";
		boolean s18 = city21.contains(city22);
		System.out.println(s18);
				
		
		
		
		
		
		
	}

}
