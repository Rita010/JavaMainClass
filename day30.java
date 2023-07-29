package One;

import java.util.ArrayList;

public class day30 {

	public static void main(String[] args) {

		// collection
		
		ArrayList<String>language = new ArrayList<>();

		//   0	     2		  3			 4	
		//["java, python, javascript, selenium"]
		
		
		language.add("java");
		language.add("python");
		language.add("javascript");
		language.add("selenium");
		
		// retrieve
		
		String a = language.get(0);
		String b = language.get(1);
		String c = language.get(2);
		String d = language.get(3);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
				
		for(int i = 0; i < language.size(); i++) {
			//System.out.println(i);
			System.out.println(language.get(i));
		}
		
		// update the value of arrayList
		
		ArrayList<String>animals = new ArrayList();
		animals.add("Dog");
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Rabbit");
		System.out.println(animals);
		
		animals.set(2, "Cat");
		System.out.println(animals);
	
		animals.remove(1);
		System.out.println(animals);
		
		
		// Adding the value to arryList
		// Updating the value arrayList
		// Deleting the value from arryList
		
		// ArrayList ---------> int
		// ArrayList ---------> String
		// ArrayList ---------> boolean
		// ArrayList ---------> person
		
		
		
		
		
	}

}
