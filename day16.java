package One;

public class day16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Human2 rita = new Human2("rita khatiwoda",43);
	Human2 pramod = new Human2("pramod regmi",48);
	
	System.out.println(rita.age);
	System.out.println(rita.name);
	
	System.out.println(pramod.age);
	System.out.println(pramod.name);
	
	String a = rita.talk();
	System.out.println(a);
		
	}
}
class Human2 {
	
	int age;
	String name;
	
	// creating construction
	
	public Human2(String nm , int ag) 
	{
	this.name = nm;
	this.age = ag;
	}
	
	public String talk()
	{
	return "Hello";	
	}
	public void walk() 
	{
	System.out.println("I am walking");	
	}

}






