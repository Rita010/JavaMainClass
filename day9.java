package One;

public class day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for(initialization ; conditionCheck ; increment/decrement)
		// statements
		
		
		// initialization
		// while(condition)
		// statements 
		// increment or decrement
		
		
		// program 1
		// print 1 to 4
		
		
		int t1 = 1;
		while(t1 <= 4) {
			System.out.println(t1); // 1 // 2 // 3 // 4
			t1 ++; // 2 // 3 // 4 // 5
			
		}

		// program 2
		// 	print 1 to 6
		
		int t2 = 1; 
		while(t2 <= 6) {
			System.out.println(t2); // 1 // 2 // 3 // 4 // 5 // 6
			t2 ++; // 2 // 3 // 4 // 5 // 6 // 7
		}
		
		
		// program 3 
		// multiples of 5
		
	int t3 = 5; 
	while(t3 <= 50) {
		System.out.println(t3); // 5 // 10 // 15 // 20 // 25 // 30 // 35 // 45 // 50 
		t3 = t3 + 5; // 10 // 15 // 20 // 25 // 30 // 35 // 40 // 45 // 50 // 55
	}
		
	
	// program 4
	// multiples of 3 in reverse 
	
	int t4 = 30;
	while(t4 >= 3) {
		System.out.println(t4); // 30 // 27 //24 // 21 // 18 // 15 // 12 // 9 // 6 // 3
		t4 = t4 - 3; // 27 // 24 // 21 // 18 // 15 // 12 // 9 // 6 // 3 
	}
	
		// program 5
	// print hello 3 times
	
	int t5 = 1; 
	while(t5 <= 3) {
		System.out.println("hello");
		t5 ++;
	}
		
	// program 6
	// multiples of 7 in reverse and break at 35
	
	int t6 = 70;
	while(t6 >= 7) {
		System.out.println(t6); //70 // 63 // 56 // 49 // 42 // 35
		if(t6 == 35) {
			break;
		}
			t6 = t6 -7; // 63 // 56 // 49 // 42 // 35
	}
	
	
	// program 7
	// print 1 to 10 but skip 5
		
	int t7 = 1; 
	while (t7 <= 10)	{
		if(t7 == 5)		{
			
			t7++;  // 6
			
			continue;	
		}
		System.out.println(t7); //1 // 2 // 3 // 4 // 6 // 7 // 8 // 9 // 10
		
		t7++; // 2 // 3 // 4 // 5 // 7 // 8 // 9 // 10 // 11
	}
	
	


	}

}
