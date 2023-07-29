package One;
import java.util.ArrayList;
public class day31 {

	public static void main(String[] args) {
		
		
		Person3 rita = new Person3("Rita", "Khatiwoda");
		Person3 rita1 = new Person3("Rita1","Khatiwoda");
		Person3 rita2 = new Person3 ("Rita2", "Khatiwoda");
		Person3 rita3 = new Person3 ("Rita3", "Khatiwoda");
		Person3 rita4 = new Person3 ("Rita4", "Khatiwoda");
		
		ArrayList<Person3> students = new ArrayList<>();
		
		students.add(rita);
		students.add(rita1);
		students.add(rita2);
		students.add(rita3);
		students.add(rita4);
		
		students.get(0).displayName();
		
		// for
		
		for(int i = 0; i < students.size(); i++) {
			//System.out.println(i);
			System.out.println(students.get(i).firstName);
			System.out.println(students.get(i).lastName);
			students.get(i).displayName();
		}
		
		// while loop 
		int t1 = 0;
		while (t1 < students.size()) {
			System.out.println(students.get(t1).firstName);
			System.out.println(students.get(t1).lastName);
			students.get(t1).displayName();
			t1++;
		}
		
		// forEach
		
		for(Person3 a : students) {
			System.out.println(a.firstName);
			System.out.println(a.lastName);
			a.displayName();
		}
		
		
		
		
	}

}
class Person3{
	String firstName;
	String lastName;
	public Person3(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;	
	}
	public void displayName() {
		System.out.println(this.firstName+this.lastName);
	}
}