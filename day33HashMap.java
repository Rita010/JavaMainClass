package One;
import java.util.HashMap;
public class day33HashMap {

	private static char[] key;

	public static void main(String[] args) {
		
	HashMap<String,Integer>students = new HashMap<>();
		
		
	students.put("rita", 43);
	students.put("satya", 37);
	students.put("laxmi", 31);
	students.put("pragati", 23);
	students.put("rashmila", 33);
	System.out.println(students); //{laxmi=31, rita=43, satya=37, pragati=23, rashmila=33}
	
	// Accessing the value from HashMap()
	
	int a = students.get("rita");
	System.out.println(a);    // 43
	
	// check particular key exists
	
	boolean b = students.containsKey("laxmi");
	System.out.println(b);    // true
	
	// total number of key value in HashMap()
	
	int c = students.size();
	System.out.println(c);    // 5  (rita,satya,laxmi,pragati,rashmila)
	
	// remove the value
	students.remove("rita");
	System.out.println(students); //{laxmi=31, pragati=23, rashmila=33, satya=37}
	
	
	// update the value
	students.put("laxmi", 27);
	System.out.println(students);  //{laxmi=27, pragati=23, rashmila=33, satya=37}
	
	// looping through HashMap
	
	System.out.println(students.values());
	System.out.println(students.keySet());
	
	
	// loop over it using above method 
	// print all keys and their values 
	
	for(String key : students.keySet()) {
		System.out.println(key);  	//laxmi
									//pragati
	}								//rashmila
									//satya
	
	for(int value: students.values()) {
		System.out.println(value);		//	27
										//	23
	}									//	33
										//	37
									
	
									
	
	
	}

}
