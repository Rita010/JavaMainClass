package One;

import java.util.ArrayList;

public class Exam5Aug7ArrayList {

	public static void main(String[] args) {
		
	//	Define a array list and loop over it
		
		
		ArrayList<String>language = new ArrayList<>();
		language.add("java");
		language.add("python");
		language.add("javascript");
		
		String a = language.get(0);
		String b = language.get(1);
		String c = language.get(2);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("______________________");
		
		for (int i = 0; i<language.size(); i++) {
			System.out.println(language.get(i));
		}
		
	}

}
