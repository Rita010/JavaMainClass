package One;

public class day20R {

	public static void main(String[] args) {
		

		
		StudentBa pramod = new StudentBa();
		System.out.println(pramod.firstName);
		System.out.println(pramod.lastName);
		System.out.println(pramod.ssn);
		pramod.displayName();
		
		TeacherB pramodb = new TeacherB();
		System.out.println(pramodb.salary);
		System.out.println(pramod.firstName);
		System.out.println(pramod.lastName);
		
		pramodb.displaySalary();
		pramodb.displayName();
		
	}

}
class StudentBa{
	String firstName = "rita";
	
	String lastName = " khatiwoda";
	int ssn = 123;
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}		
}
class TeacherB extends StudentBa {
	int salary = 5000;
	public void displaySalary() {
		System.out.println(this.salary);
	}
}








