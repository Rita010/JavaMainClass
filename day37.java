package One;

import java.util.Arrays;
import java.util.List;

public class day37 {

	public static void main(String[] args) {
		
		// Stream - API testing
		
		// count of blank strings
		
		List<String> name = Arrays.asList("rita","","pragati","laxmi","","satya");
		System.out.println(name.stream().filter(x -> x.isEmpty()).count());
		
		
		// taking the blank String to list
		
		List<String> name2 = Arrays.asList("rita","","pragati","laxmi","","satya");
		System.out.println(name.stream().filter(x ->x.isEmpty()).toList());
		
		//Only the string
		
		List<String> name3 = Arrays.asList("rita","","pragati","laxmi","","satya");
		System.out.println(name.stream().filter(x -> !x.isEmpty()).toList());
		
		// names starts with "s"
		
		List<String> name4 = Arrays.asList("rita","","pragari","laxmi","","satya");
		System.out.println(name4.stream().filter(x -> x.contains("r")).toList());
		
		// string grater than 5
		System.out.println(name4.stream().filter(x -> x.length()>5).toList());
		
		// working with every element of string
		// ["rita", "pragati", "laxmi"] ===> // ["RITA", "PRAGATI","LAXMI"]
		// ["rita", "pragati", "laxmi"] ===> // ["rita", "pragati"]
		
		List<Integer> transactions = Arrays.asList(100, -1000, 7000, -900, -4000, 98);
		
		System.out.println(transactions.stream().filter(tra -> tra >0).toList());
		System.out.println(transactions.stream().filter(tra -> tra <0).toList());
		
		// convert every list in map to Upper Case()
	
		List<String> countries = Arrays.asList("Nepal","America","China","Bangladeah","Bhutan");
		System.out.println(countries.stream().map(x -> x.toUpperCase()).toList());
		
		// printing table of 2
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(numbers.stream().map(x -> x * 2).toList());
		
		List <Integer> salary = Arrays.asList(5075,6500,7500,9755,450);
		System.out.println(salary.stream().map(x -> x *0.10).toList());
		
		
		
		
		
		
		
	}
}
