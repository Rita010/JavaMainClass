package One;

import java.net.MulticastSocket;

public class day29ExceptionalHangelling {

	public static void main(String[] args) {

		// program 1
		
		System.out.println("Hello");
		System.out.println(5/5);
		System.out.println("bye");
		
		
		// program 2
		
		System.out.println("Hello");
		try {
			int dividedByZero=5/0;
			System.out.println("Rest of the code is in try block");
			System.out.println("Rest of the code is in try block2");
			System.out.println("Rest of the code is in try block3");
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
			System.out.println("bye");
		
		
		// program 3
		
		System.out.println("Define an array with values");
		int [] numbers = {1,2,3,4};
		try {
			System.out.println(numbers[0]);
			System.out.println(numbers[5]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(("moving ahead after manging the exception"));	
		
		
		// program 4
		
		System.out.println("define an array with values");
		
		try {
			int []numbers2 = {1,2,3,4};
			System.out.println(numbers2[5]);
			System.out.println(5/0);	
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("please enter a valid index for array");
				System.out.println(e.getMessage());
			}
			catch(ArithmeticException e) {
				System.out.println("please enter a valid input");
				System.out.println(e.getMessage());
			}
			catch(Exception e)	{
				System.out.println("Exception handled successfully");
			}
		
			System.out.println("Moving ahead after managing the exception");
		
		
		// program 5
			
		
		System.out.println("hello");
		try {
			System.out.println(5/0);
		}
		catch(Exception e) {
			System.out.println("Exception managed successfully");
			String msg = e.getMessage();
			System.out.println(msg);
		}
		finally {
			System.out.println("It wil be executed anyhow");
		}
}

}

















