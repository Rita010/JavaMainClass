package One;

public class day21 {

	public static void main(String[] args) {

	Student rita = new Student();
	System.out.println(rita.firstName);
	System.out.println(rita.lastName);
	System.out.println(rita.age);

	rita.age = 43;
	rita.firstName = "rita";
	rita.lastName = "khatiwoda";
	
	
	System.out.println(rita.firstName);
	System.out.println(rita.lastName);
	System.out.println(rita.age);
	rita.displayNamae();
		
	System.out.println("--------------------");
	
	
	// Creating object of TeacherA	
		
		TeacherA a = new TeacherA();
		System.out.println(a.salary);
		
		a.firstName = "rita a";
		a.lastName = "khatiwada d";
		a.age = 33;
		a.salary = 5000;
		
		System.out.println(a.firstName);
		System.out.println(a.lastName);
		System.out.println(a.age);
		
		a.displaySalary();
		a.displayNamae();
		
	
	
	}

}
class Student {
	
	String firstName;
	String lastName;
	int age;
	
	public void displayNamae() {
		System.out.println(this.firstName + this.lastName);
	}
}
class TeacherA extends Student{
	int salary;
	
	public void displaySalary() {
		System.out.println(this.salary);
	}
}








