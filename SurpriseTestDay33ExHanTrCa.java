package One;

public class SurpriseTestDay33ExHanTrCa 
{

	public static void main(String[] args) 
{
		
		// Program 1
		
		System.out.println("Hello");
		System.out.println(5/0);
		
		try {
			System.out.println(5/0);
		}
		catch(ArithmeticException e) {
			System.out.println("please enter the valid input");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Moving ahead after managing the exception");
		}
	
		 //program 2
		
		
		
	

	
	}

}
