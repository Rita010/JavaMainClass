package One;

public class day21b {

	public static void main(String[] args) {

	
		TeacherN ritaBN = new TeacherN("rit", " kha", 20, 1244);
		
		System.out.println(ritaBN.firstName);
		System.out.println(ritaBN.lastName);
		System.out.println(ritaBN.age);
		System.out.println(ritaBN.salary);
		
		ritaBN.displayName();
		ritaBN.displaySalary();
		
	}

}
	class StudentN{
	String firstName;
	String lastName;
	int age;
	
	public StudentN(String fn , String ln, int ag) {
		
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;
		
	}
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}
	class TeacherN extends StudentN{
		
	int salary;
	
	public TeacherN(String fn, String ln, int ag, int sal) {
		super(fn,ln,ag);
		this.salary = sal;
	}
	public void displaySalary() {
		System.out.println(this.salary);
	}
}




