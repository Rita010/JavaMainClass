package One;

public class SingletonlPractice1 
{

	public static void main(String[] args) 
	{

		Flower FL = Flower.getflw();
		
		FL.DisplayFlower();


	}
}
class Flower
{
	
	// create object  
	private static Flower flw = null;	
	//default constructor
	private Flower() {
		System.out.println("Flower is beautiful");
	}
	
	// function
	public static Flower getflw() 
	{
		
		 if(flw == null)
		{
			flw = new Flower();
		}
		 return flw	;
	}
	// method
	public void DisplayFlower()
	{
		System.out.println("Flower is smelling very good.");
	}
	
}