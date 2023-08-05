package One;

import java.util.ArrayList;

public class SurpriseTestDay33DefineArrayListAndLoopthroughIt {

	public static void main(String[] args) {
	
		Person14 rita = new Person14("rita","khatiwoda");
		Person14 rita1 = new Person14("rita1","khatiwoda");
		Person14 rita2 = new Person14("rita2", "khatiwada");
		Person14 rita3 = new Person14("rita3","khatiwoda");
		
		ArrayList<Person14> student = new ArrayList<>();
		student.add(rita);
		student.add(rita1);
		student.add(rita2);
		student.add(rita3);
		
		student.get(0).displayName();
		
		//for
		
		for (int i = 0; i < student.size(); i++) {
			System.out.println(student.get(i).firstName);
			System.out.println(student.get(i).lastName);
			student.get(i).displayName();
		}
		
		// while
		
		int t1 =0;
		while(t1<student.size()) {
			System.out.println(student.get(t1).firstName);
			System.out.println(student.get(t1).lastName);
			student.get(t1).displayName();
			t1++;
		}
		
		
		
		
		
	}
}
class Person14{
	String firstName;
	String lastName;

	public Person14(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	public void displayName() {
		System.out.println(this.firstName+this.lastName);
	}
	
}
