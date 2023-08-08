package One;

import java.util.HashMap;

public class Exam5Aug7HashMap {

	public static void main(String[] args) {

			//Defined a hashmap and loop over it
		
		HashMap<String,Integer>student = new HashMap<>();
		
		student.put("rita", 43);
		student.put("pragati", 23);
		student.put("Laxmi", 32);
		System.out.println(student);
		
		for(String key: student.keySet()) {
			System.out.println(key);
		}
		for(int value : student.values())
			System.out.println(value);
		
	}

}
