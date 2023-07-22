package One;

public class day20 {

	public static void main(String[] args) {

		Student2 A = new Student2();
		System.out.println(A.firstName);
		System.out.println(A.lastName);
		System.out.println(A.ssn);
		
		Teacher Aa = new Teacher();
		System.out.println(Aa.firstName);
		System.out.println(Aa.lastName);
		System.out.println(Aa.ssn);
		System.out.println(Aa.Salary);
		
		Aa.displayName();
		Aa.displaySlary();
		
		
		
		

	}

}
class Student2{
	String firstName = "Rita";
	String lastName = "Khatiwoda";
	int ssn = 123;
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}
class Teacher extends Student2{
	int Salary = 20000;
	public void displaySlary() {
		System.out.println(this.Salary);
	}
	
}