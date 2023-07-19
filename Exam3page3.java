package One;

public class Exam3page3 {

	public static void main(String[] args) {
		
 //3. Write and example of Multiple level inheritance (a ->b ->c)		
		
		teacherBB rita = new teacherBB("Rita","Khatiwoda", 43, 5000);
		
		System.out.println(rita.firstName);
		System.out.println(rita.lastName);
		System.out.println(rita.age);
		System.out.println(rita.salary);
		
		rita.displayfullName();
		rita.displaySalary();
		
		
		professorBB gita = new professorBB("Gita","Khatiwoda", 40, 10000,3);
		
		System.out.println(gita.firstName);
		System.out.println(gita.lastName);
		System.out.println(gita.age);
		System.out.println(gita.salary);
		System.out.println(gita.numofSubjects);
		
		gita.displayfullName();
		gita.displaySalary();
		gita.displaynos();
		
	}
}
class studentE{
	String firstName;
	String lastName;
	int age;
	public studentE(String fn, String ln, int ag) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;
	}
	public void displayfullName() {
		System.out.println(this.firstName + this.lastName);
	}
}
class teacherBB extends studentE{
	int salary;
	
	public teacherBB(String fn, String ln, int ag, int sal) {
		super(fn, ln, ag);
		this.salary = sal;
	}
public void displaySalary() {
	System.out.println(this.salary);
}
}
class professorBB extends teacherBB{
	
	int numofSubjects;
	
	public professorBB(String fn, String ln, int ag, int sal, int nos) {
		super(fn,ln,ag,sal);
		this.numofSubjects = nos;
	}
	public void displaynos() {
		System.out.println("total 3 major subjects");
	}
}




