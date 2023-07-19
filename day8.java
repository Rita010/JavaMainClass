package One;

public class day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print 1 to 5

		// System.out.println(1);
		// system.out.println(2);
		// system.out.println(3);
		// system.out.println(4);
		// system.out.println(5);
		
		// loops - for loop and another while loop
		// for(initialization ; conditionCheck ; increment/ decrement)
		{
			// statements
		}
		
		// program 1
		
		for (int i = 1; i <=5; i++) { //2 // 3 // 4 // 5 // 6
			System.out.println(i);
			// i -1
			// i -2
			// i -3
			// i -4
			// i -5
			
		}
		
		
		// program 2
		
		// print hello 4 times
		
		for (int i = 1; i <=4; i++) { // 2 // 3 // 4 //5
			System.out.println("hello");
			// hello
			// hello
			// hello
			
		}
		
		// program 3 
		
		for (int i = 1; i <= 5 ; i++) { // 2 // 3 // 4 // 5 //6
			System.out.println(i); // 1 // 2 // 3 // 4 // 5
			
		}
		
		// program 4
		
		for (int i = 1; i  <= 3 ; i++) { // 2 // 3 // 4
		System.out.println(i); // 1 // 2 // 3 
		
		}
		
		// program 5
		for (int i = 5; i >= 1; i--) { // 4 // 3 // 2 // 1 // 0
			System.out.println(i); // 5 // 4 // 3 // 2 // 1
		}

		// program 6
		for (int i = 2; i <= 16; i = i + 2) { // 4 // 6 // 8 // 10 // 12 // 14 // 16 // 18
			System.out.println(i); // 2 // 4 // 6 // 8 // 10 // 12 // 14 // 16
		}
		// program 7
		for (int i = 5 ; i >= 1 ; i--) { // 4 // 3 // 2 // 1 // 0
			System.out.println(i); // 5 // 4 // 3 // 2 // 1
		}
		// program 8
		// for loop with break; 
		
		for (int i = 1; i < 4 ; i ++) { // 2
			if (i == 2) {
				break;
			}
			System.out.println(i); // 1
		}
		
		// program 9
	for(int i = 1 ; i <= 5 ; i++)	{ // 2 // 3
	System.out.println(i);	// 1 // 2 // 3
		if (i == 3) {
			break ; 
		}
	}
	// program 10
	
	for (int i = 5 ; i >= 1 ; i--) { // 4 // 3
		if (i == 3) {
			break;
		}	
		System.out.println(i ); // 5 // 4  
	}
	
	// program 11 
	
	for (int i = 50 ; i >= 5 ; i = i-5 ) { // 45 //40
		System.out.println(i); // 50 // 45 // 40
		if (i == 40) {
			break;
		}
	}
		//  program 12
	
	for (int i = 1 ; i <= 3 ; i++) { // 2 // 3 // 4
		System.out.println(i); // 1 // 2  // 3
	}
		
	// program 13
	// continue statement with for
	
	for (int i = 1 ; i <= 5 ; i++) { // 2 // 3 // 4 // 5 // 66
		if (i == 3)	{
			continue;
		}
		System.out.println(i); // 1 // 2  // 4  // 5
	}
	// program 14
	
	for (int i = 1 ; i <= 5 ; i++) { // 2 // 3 // 4 // 5 // 6
		if (i == 2) {
			continue;
		}
		System.out.println(i); // 1  // 3 // 4 // 5 
	}

	// program 15
	
	for (int i = 5 ; i >= 1; i --) { // 4 // 3 // 2 // 1  // 0
		if (i==2) {
			continue; 
		}
		System.out.println(i); // 5 // 4 // 3 // 1
	}
		
		
		
		
		
		
		
		
		
		
	}

}
