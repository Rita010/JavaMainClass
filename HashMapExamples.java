package One;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator; 
public class HashMapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// HashMap 
		// HashMap Stores in the form of Key-value pair
		
		
		
		 HashMap<String , Integer> hashMapOne = new HashMap<>(); 
		  System.out.println(hashMapOne); 
		
		
		// add
		//			    key, value  			
		  hashMapOne.put("One", 1);
		  hashMapOne.put("Two", 2);
		  hashMapOne.put("Three", 3);
		System.out.println(hashMapOne);
		
		// update
		
		hashMapOne.put("Three", 7);
		System.out.println(hashMapOne);  // value 7 is updated in Three
		
		
		// getting the value (retrive)
		
		int a = hashMapOne.get("One");
		System.out.println(a);
		
		
		// delete
		
		
		hashMapOne.remove("One");
		System.out.println(hashMapOne);
		
		
		
		// Does HashMap allow Duplicate Keys??
		// No, it simply update the value
		
		hashMapOne.put("Three", 4);
		System.out.println(hashMapOne);
		
		
		// how many key-values are there  
		
		System.out.println(hashMapOne.size());  // 2
		
		
		HashMap<String, String>hashMapTwo= new HashMap<>();
		
		hashMapTwo.put("Az", "Glandel");
		hashMapTwo.put("Tx", "Texas");
		hashMapTwo.put("CA", "SanDiego");
		hashMapTwo.put("ID", "Boise");
		
		// to check whether a key exist or not??
		
	System.out.println("--------------------------------");  
	
		if(hashMapTwo.containsKey("AZ")) {
			System.out.println(hashMapTwo.get("AZ"));   // it doesn't run
		}
		if (hashMapTwo.containsValue("Glendale")) {
			System.out.println("value available.....");
		}
		
		// containsKey() and containsValue -- Return boolean values
		
		for(String key : hashMapTwo.keySet()) {
			System.out.println(key);
			System.out.println(hashMapTwo.get(key));
		}
		
		System.out.println(hashMapTwo.keySet());
		System.out.println(hashMapTwo.values());
		
		for(Map.Entry<String, String>entry: hashMapTwo.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		
		///
		
		
		HashMap<String,String>hashMapThree=new HashMap<>();
		
		hashMapThree.put("rita", "khatiwoda");
		hashMapThree.put("laxmi", "chapagain");
		hashMapThree.put("pragati", "gautam");
		hashMapThree.put("satya", "koka");
		hashMapThree.put("rashmi", "kc");
	
		System.out.println(hashMapThree);
	
		
		Iterator<Map.Entry<String, String>>abc = hashMapThree.entrySet().iterator();
		
		while(abc.hasNext()) {
		Map.Entry<String, String>entry = abc.next();	
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
