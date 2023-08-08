package One;
import java.util.ArrayList;
public class day32ArrayListOfBolean {

	public static void main(String[] args) {


	ArrayList<String> names = new ArrayList<>();
		
		// add()
	
	boolean a = names.add("Rita");
		System.out.println(a);   // true
		
		names.add("ram");
		names.add("sarika");
		names.add("poorva");
		System.out.println(names);   // [Rita, ram, sarika, poorva]
		
		// add(position, element)
		names.add(2, "Maya");        // in index 2 maya is added [Rita, ram, Maya, sarika, poorva]
		System.out.println(names);
		
		// remove
		
		//	  0     1    2     3       4
		
		// [Rita, ram, Maya, sarika, poorva]

		names.remove(1);
		System.out.println(names);  // ram is removed  [Rita, Maya, sarika, poorva]

		names.remove("sarika");
		System.out.println(names);  // Sarika is removed [Rita, Maya, poorva]
		
		
		// clear()
		
		names.clear();
		System.out.println(names);  // [] all names are removed only the list(array's) is printout
		
		names.add("sarika");
		names.add("mayuri");
		names.add("roshani");
		names.add("abhisha");
		names.add("poorva");
		System.out.println(names); // [sarika, mayuri, roshani, abhisha, poorva]
		
		// set()
	
		names.set(1, "komal");
		System.out.println(names);  // komal replace Mayuri(index 1)
		
		// contains()
		
		boolean q1 = names.contains("sarika");   // true
		System.out.println(q1);
		
		
		//   0    	 1   	 2     	  3       4
		//[sarika, komal, roshani, abhisha, poorva]
		
		// get()
		
		String eleAtIndex2 = names.get(2);
		System.out.println(eleAtIndex2);  // roshani
		
		// indexOf()
		
		int nums = names.indexOf("poorva");
		System.out.println(nums);        // 4
		
		
		int numsB = names.indexOf("poorva");
		System.out.println(numsB);		// 4
		
		
		System.out.println("-----------------------------------");
		
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("grapes");
		fruits.add("papaya");
		System.out.println(fruits);   //[apple, banana, grapes, papaya]

		
		String userInput = "apple";
		
		if(fruits.contains(userInput)) {
			System.out.println("Element available");  // "apple" Element available 
		}
		else {
			System.out.println("Element not availble");
		}
		
		// indexOf()

		if(fruits.indexOf("apple") >= 0) {
			System.out.println("Element available");
		}
		else {
			System.out.println("Element not availble");   // Element available
		}
		
		
		ArrayList<String>cities = new ArrayList<>();
		cities.add("phoenix");
		cities.add("glendale");
		cities.add("tempe");
		cities.add("mesa");
		cities.add("phoenix");
		
		System.out.println(cities.size());     //5
		System.out.println(cities);  //[phoenix, glendale, tempe, mesa, phoenix]
		
		System.out.println(cities.indexOf("phoenix"));  // 0
		System.out.println(cities.lastIndexOf("phoenix")); // 4
		System.out.println(cities.lastIndexOf("surprise")); // -1
		
	}

}
