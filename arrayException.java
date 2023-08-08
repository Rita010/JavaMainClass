package One;

public class arrayException {

	public static void main(String[] args) {
//		
//		int []nepal = {11,22,33};
//		System.out.println(nepal[4]);
//		
		try 
		{
			int []nepal1 = {11,22,33};
			System.out.println(nepal1[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("please enter valid index for array");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("moving ahead after managing exception");
		}
		
	}

}
