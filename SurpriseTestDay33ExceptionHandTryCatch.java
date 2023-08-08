package One;

public class SurpriseTestDay33ExceptionHandTryCatch 
{

	public static void main(String[] args) 
{
//		
//		// Program 1
//		
//		System.out.println("Hello");
//		System.out.println(5/0);
//		
//		try {
//			System.out.println(5/0);
//		}
//		catch(ArithmeticException e) {
//			System.out.println("please enter the valid input");
//			System.out.println(e.getMessage());
//		}
//		finally {
//			System.out.println("Moving ahead after managing the exception");
//		}
	
		 //program 2
		
		int[]number3 ={1,2,3,4};
		System.out.println(number3[5]);
		System.out.println(6/0);

		
		try {
			int[]number4 ={1,2,3,4};
			System.out.println(number4[5]);
			System.out.println(6/0);
		}
		catch(ArithmeticException e) {
			System.out.println("please enter valid input");
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception handled successfully");
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("moving ahead after managing the exception");
		}

	
	}

}
