package One;

public class day19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentC rita = new StudentC("rita", "khatiwada", 111);
		System.out.println(rita.firstName);
		System.out.println(rita.lastName);
		System.out.println(rita.ssn);
		rita.dispalyName();

		TeacherC rita1 = new TeacherC("rita1", "khatiwoda1", 222, 9000);
		System.out.println(rita1.firstName);
		System.out.println(rita1.lastName);
		System.out.println(rita1.ssn);
		System.out.println(rita1.salary);
		
		rita1.dispalyName();
		rita1.displaySalary();
	}

}
// first create class then constructor then method  after that  create object in main 
class StudentC {
	String firstName;
	String lastName;
	int ssn;

	public StudentC(String fn, String ln, int ss) {
		this.firstName = fn;
		this.lastName = ln;
		this.ssn = ss;

	}

	public void dispalyName() {

	}
}

class TeacherC extends StudentC {
	int salary;

	// mandatory to have child constructor as parent is having
	// constructor
	// First line of child constructor should be called to parent 
	//.. constructor
	      
	public TeacherC(String fn, String ln, int ss, int sal) {
		super(fn, ln, ss);
		this.salary = sal;
	}

	public void displaySalary() {
		System.out.println(this.salary);
	}
}
