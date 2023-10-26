package One;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsForRest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	// program 1
		// lamda expression ->
		
		List<String> names = Arrays.asList("rita","pramod","silva", "suva","swopnil","swornima");
		List<String> longNames = names.stream().filter(x ->x.length()>5).collect(Collectors.toList());
		System.out.println(longNames);
						
	// program 2
		
		List<Integer> transaction = Arrays.asList(100,122,-333,565,-786,279,-543);
		List<Integer> deposit = transaction.stream().filter(x-> x > 0).collect(Collectors.toList());
		System.out.println(deposit);
		
		List<Integer> withdrawl = transaction.stream().filter(x-> x < 0).collect(Collectors.toList());
		System.out.println(withdrawl);
		
	// program 3
		
		List<Integer> birthYear = Arrays.asList(1985,1987,1989,1992,1995);
		List<Integer> ages = birthYear.stream().map(x -> 2023 - x).collect(Collectors.toList());
		System.out.println(ages);
		
	// Program 4
		
		List<Integer> tables = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> twoTable	= tables.stream().map(x -> x*3).collect(Collectors.toList());
		System.out.println(twoTable);
		
		/*
		 * Example:
		 * 
		 * int [] nums = {11,22,33}; int total = 0; for (int i = 0; i < nums.length ;
		 * i++) { total = total + nums[i]; }
		 * System.out.println(total);
		 */	
		
		
	// program 5 
		
		List<Integer> numbers = Arrays.asList(12,13,14,15);
		int sum = numbers.stream().reduce(0, (x,y) -> x+y);
		
		System.out.println(sum);
		
	// program 6
		
		List<String> student = Arrays.asList("rita","pramod","silva","swopnil","swornima","suva");
		student.stream().forEach(name -> System.out.println("welcome" + " "+ name));
		

	}

}
