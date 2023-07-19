package One;

public class day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// program 1 
	
		
	String city1 = "Glandale";
	String uc = city1.toUpperCase(); 
	System.out.println(uc);
	System.out.println(city1.toUpperCase());
	System.out.println("Welcome to ".toUpperCase()+uc);
	
	
	// program 2
	
	
	String city2 = "CHandler";
	String lc = city2.toLowerCase();
	System.out.println(lc);
	
	
	// program 3
	
	String city3 = "Buckeye";
	int toc = city3.length();
	System.out.println(toc);
			
	
	
	// program 4
	
	
	String city4 = "Surprise";
	int toc2 = city4.toUpperCase().toLowerCase().length();
		System.out.println(toc2);	
	
		
		
	// program 5
	
		
	//	0 1 2 3 4 5 	
	//	P a y s o n
		
	String city5 = "Payson";
	char c = city5.charAt(city5.length()-1);
	System.out.println(c);
	
	
	// program 6
	
	
	String city6 = "Phoenix";
	
	
	// 0 1 2 3 4 5 6
	// P h o e n i x
	
	//String s1 = city6.substring(3);
	//System.out.println(s1);
	//city6.substring(startIndex, endIndex(not included);
	
	
	String s2 = city6.substring(1,3);
	System.out.println(s2);
	
	
	
	
	
	
	
	
	}

}
