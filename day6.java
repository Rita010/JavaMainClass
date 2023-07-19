package One;

public class day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// conditional statements
		// one input and multiple outcomes
		
		// numT > 0 && numT <= 5 --- 10% discount
		// numT > 5 && numT <= 10--- 20% discount
		// numT > 10 --------------- 30% discount
		
		// if (condition)
		
		// statement will be executed 
		
		// program 1
	
		int numT = 15;
		
		if (numT > 0 && numT <= 5) {
			System.out.println("10% discount");
		}
		if (numT > 5 && numT <= 10) {
			System.out.println("20% discount");
		}
		if (numT > 10) {
			System.out.println("30% discount");
		}

		// program 2 
		
		int numTa = -15;
		
		if (numTa > 0 && numTa <= 5) {
			System.out.println("10 discount");
			} 
		else if (numTa >5 && numTa <=10){
		System.out.println("20% discount");
		
		}else if (numTa > 10) {
			System.out.println("30% discount");
		} 
	else {
			System.out.println("incorrect input");
	}

	// program 3
		
		int marks = 95;
		
		if (marks > 70) {
		System.out.println("Grade C");
		}
		if (marks > 80) {
			System.out.println("Grade B");
		}
		if (marks > 90) {
		System.out.println("Grade A");
		}
	
		// program 4
		
		int marksB = 60;
				if (marksB > 80) {
					System.out.println("Grade A");
				}
				else if (marksB > 70) {
					System.out.println("Grade B");
				}
				else if (marksB > 60) {
	System.out.println("Grade C");
				}
				else {
					System.out.println("Fail try again");
				}
		
				//Program 5

		int x = 20;
		int y = 40;
		
		if (x > y) {
			System.out.println("x is greater");
		}
		else { 
		System.out.println("y is grater");
		}
		
		// program 6
		
		int a = 20;
		int	b = 30;
		int	c = 40;
			
			if (a > b && a > c) {
				System.out.println("a is grater");
			}
			else if (b > a && b > c) {
				System.out.println("b is grater");
			}
			else {
				System.out.println("c is grater");
			}
		
		
		
		
		
		
	}

}
