package One;

public class exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. write a function for addition of two numbers.
		// 2. Define two variables and perform arithmetic operation.
		// 3. Define 3 variables and print greatest variable out of three.
		// 4. Write a program for switch case. (case for city and print respective state)
		

		//Q.no 1. Function for addition of two numbers
		
		int x = 10;
		int y = 5;
		
		System.out.println(x + y);

		
		// Q. no. 2. Arithmetic operations
		
		int m = 15;
		int n = 3;
	
		
		System.out.println(m + n);
		System.out.println(m - n);
		System.out.println(m * n);
		System.out.println(m / n);
		System.out.println(m % n);
		

		// Q. no. 3. Greatest variable out if three variable 
		
		int p = 20, q = 30, r = 40;
		
		if (p > q && p > r)
		{
			System.out.println("p is greatest number");
		}
		else if (q > p && q > r)
		{ 
			System.out.println("q is greatest number");
		}
		else 
		{
			System.out.println("r is greatest number");
		}
			
		// Q. no. 4. Program for switch case (case for city and print respective state)
		
		String city = "Sanepa";// input

		switch (city) 
		{
		case "Baneshwor":
			System.out.println("Ktm");
			break;
		case "Jadibudi":
			System.out.println("Bkt");
			break;
		case "Sanepa":
			System.out.println("Lalit");
			break;
		default:
			System.out.println("Incorrect city name");
		
		}
		
		
		
	}	
		
	}			


