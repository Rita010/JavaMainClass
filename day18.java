package One;

public class day18 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	Vehicle Ford = new Vehicle();
	Vehicle audi = new Vehicle (" Audi ");
	Vehicle bmw = new Vehicle (" Audi ","Q4");	
		
	}

}
class Vehicle{
	String name;
	String model;
	
	// default constructor is always called; 
	// class can have multiple constructor (constructor overloaded)
	// constructor don't have return type
	// constructor name should be similar to class name
	
	public Vehicle() 
	{
		System.out.println("Default constructor is called");
	}
	public Vehicle(String nm) 
	{
		this.name = nm;
		System.out.println("The name of vehicle " + this.name);
	}
	public Vehicle(String nm , String md1) 
	{
		this.name = nm;
		this.model= md1;
		System.out.println("The name of vehicle"+ this.name + this.model);
	}
	
	
}