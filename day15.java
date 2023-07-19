package One;

public class day15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	// User defined data type
		
	// Creating a instance or object
	
		
	Human rita = new Human();
	System.out.println(rita.age);
	System.out.println(rita.name);
		rita.walk();
		rita.talk();
		
		rita.age = 43;
		rita.name = "Rita Khatiwoda";
		System.out.println(rita.age);
		System.out.println(rita.name);
		
		
		// Creating another object
		
		Human pramod = new Human();
		System.out.println(pramod.age);
		System.out.println(pramod.name);
		
		pramod.talk();
		pramod.walk();
		
		pramod.age = 48;
		pramod.name = "Pramod Regmi";
		System.out.println(pramod.age);
		System.out.println(pramod.name);		
			
	}
		
	}
	
class Human{
	// Properties and methods
	int age;
	String name;
	

	public void talk() 
	{
	System.out.println("He is talking");	
	}
	
	public void walk()
	{
	System.out.println("He is walking");
	}
	
  }





















