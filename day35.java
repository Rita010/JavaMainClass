package One;
import java.util.HashMap;
import java.util.Map;
public class day35 {

	public static void main(String[] args) {

		// program 1
		
		Map<String, String> course = new HashMap<String, String>();
		course.put("course", "javascript");
		course.put("courseTwo", "html");
		course.put("courseThree", "css");
		course.put("courseFour", "python");
		course.put("courseFive", "selenium");
		System.out.println(course);
		
		for (Map.Entry<String, String> entry : course.entrySet()) {
			System.out.println(entry.getKey()+ entry.getValue());
		}
		
		// program 2
		
		Map<String, String> students = new HashMap<String, String>();
		students.put("firstName", "rita");
		students.put("lastName", "khatiwoda");
		students.put("rollNo", "2");
		students.put("age", "43");
		students.put("skills", "painting");
		
		
	// looping through keys
		for(String propVariable : students.keySet()) {
			System.out.println(propVariable);
		}
		
	// looping through values
		for(String propVariable : students.values()) {
			System.out.println(propVariable);
		}
		
	// another program
		
		Map<String, String> vehicle = new HashMap<String, String>();
		vehicle.put("color", "red");
		vehicle.put("type", "truck");
		vehicle.put("company", "ford");
		System.out.println(vehicle);
		
		System.out.println(vehicle.get("color"));
		for(String key : vehicle.keySet()) {
			System.out.println(key);
			System.out.println(vehicle.get(key));
		}
		
		// Iterator
		
		
		
		
		
		
		// forEach
		
	}

}
