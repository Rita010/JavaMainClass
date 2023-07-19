package One;

public class day17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			    //Program 1
			    
			    Person Rita = new Person ("Rita","Khatiwoda",43);
			    Person []students = 
			    {
			        new Person ("Rita","Khatiwoda",43),
			        new Person ("Kalpana","Bhattarai",46),
			        new Person ("Deepa","Rupakhettee",44),
			        new Person ("Silva", "Bhattarai", 20),
			        new Person ("Swapnil","Dahal",18)
			    };
			    
			    //for loop
			    
			    for (int i = 0; i < students.length; i++) 
			    {
			      students[i].displayName();
			    }
			    
			    //while loop
			    
			    int m = 0;
			    while (m < students.length) 
			    {
			      students[m].displayName();
			      m++;
			      
			    }
			    
			    //for each loop
			    
			    for (Person student : students) 
			    {
			      student.displayName();
			    }
			    
			    
			    //Program 2
			    
			    Calculator calcu = new Calculator();
			    calcu.addition (1,2);
			    calcu.addition (3,4,5);
			    calcu.addition (6,7,8,9);  
			    
			    }
			}

			//Program 1

			class Person 
			{
			String firstName;
			String lastName;
			int age;

			public Person (String fn, String ln, int ag) 
			{
			  this.firstName = fn;
			  this.lastName = ln;
			  this.age = ag;
			}

			public void displayName() 
			{
			  System.out.println(" first name:\t" + this.firstName + "\t last name:\t"+this.lastName + "\t age:\t"+this.age);
			}
			}

			//Program 2

			class Calculator
			{
			  
			  public void addition (int x, int y) 
			  {
			    System.out.println(x + y);
			  }
			  
			  public void addition (int x,int y,int z) 
			  {
			    System.out.println(x + y + z);
			  }
			  
			  public void addition (int x,int y,int z,int a) 
			  {
			    System.out.println(x + y + z + a);
			  }
			}

		

			    
			    
			 