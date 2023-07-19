package One;

public class day23d {

	public static void main(String[] args) {
		
		
		Professor f = new Professor("Maths");
		f.displaySubjects();
		f.abc();
		
		
	}

}

class TeacherE{
	protected String subject;
	public TeacherE(String sub) {
		this.subject = sub;
	}
	public void abc() {
		System.out.println("teacher abc");
	}
}

class Professor extends TeacherE{
	
	String subject = "chemistry";
	public Professor(String sub) {
		super(sub);
	}
	public void displaySubjects() {
		System.out.println(this.subject);
		System.out.println(super.subject);
	}
	public void sharma() {
		System.out.println("professor abc");
		super.abc();
		
	}
}


// private field and private method
// super keyword for method and super keyword for field
// protected key for inherited class































