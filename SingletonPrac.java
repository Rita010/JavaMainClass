package One;

public class SingletonPrac {

	public static void main(String[] args) 
	{
		CreditUnion obj;
		// initialize obj
		obj = CreditUnion.getcu();
		System.out.println(obj.DisplayMessage);
		obj.DisplayMessage();

	}

}
class CreditUnion
{ 
	//properties
	String DisplayMessage;	
	// private cu , so it can be access by getcu method only
	private static CreditUnion cu;
	//constructor for prevent to make object
	private CreditUnion()
	{
		DisplayMessage="Welcome to our Credit Union";
	}
	// method to return object of class i.e cu
	public static CreditUnion getcu()
	{ 
		if( cu == null) 
		{
		cu = new CreditUnion();
		}
		return cu;
		
	}
	 
	public void DisplayMessage() 
	{
		System.out.println("hi i am from method public ");
	}
}