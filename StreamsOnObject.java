package One;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsOnObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<PersonG> people = new ArrayList<>();
		people.add(new PersonG("rita","khatiwoda",26));
		people.add(new PersonG("pramod","regmi",33));
		people.add(new PersonG("swapnil","rupakhetee",34));
		people.add(new PersonG("silva","bhattarai",31));
		people.add(new PersonG("rita","khatiwoda",26));
		people.add(new PersonG("suva","sharma",18));
		
		// program 1
		
		// Filtering : Get people older than 30
		
		List<PersonG> aboveAge30 = people.stream().filter(x -> x.getAge()>30).collect(Collectors.toList());
		aboveAge30.forEach(x -> System.out.println(x.displayName()));
		
		// program 2
		
		// Filtering based on name : "rita"
		
		List<PersonG> filterOnName = people.stream().filter(x -> x.displayName().contains("rita")).collect(Collectors.toList());
		filterOnName.forEach(x -> System.out.println(x.displayName()));
		
		// program 3
		
		// Collecting only the names in one list
		
		List<String> names = people.stream().map(x -> x.firstName).collect(Collectors.toList());
		names.forEach(x -> System.out.println(x));
		
		// program 4
		
		// average age
		
		List<Integer> ages = people.stream().map(x -> x.age).collect(Collectors.toList());
		int sum = ages.stream().reduce(0, (x,y)-> x+y);
		System.out.println(sum/people.size());
		
		// OR
		
		int avg = people.stream().map(x -> x.age).collect(Collectors.toList())
				.stream().reduce(0, (x,y) -> x+y)/people.size();
		System.out.println(avg);
		
		// Sorting the people in ascending order by their age
		
		List<PersonG> sortedPeopleByAge = people.stream()
				.sorted(Comparator.comparingInt(PersonG::getAge))
				.collect(Collectors.toList());
		
		sortedPeopleByAge.stream().forEach(x -> System.out.println(x.displayName()));
		
		
		// count the number of people with same age
		
		Map<Integer, Long> ageCount = people.stream()
				.collect(Collectors.groupingBy(PersonG::getAge, Collectors.counting()));
		
		ageCount.forEach((age, count) -> System.out.println("Age " + age + " : " + count + " Person(s)"));
		
		// name of first 3 people where age > 30
		
		List<String> name = people.stream().filter(p -> p.getAge() > 30)
				.limit(3).map(PersonG::displayName).collect(Collectors.toList());
		System.out.println(name);
		
		// distinct name list
		
		List<String> distinctNames = people.stream().map(PersonG::displayName).distinct()
				.collect(Collectors.toList());
		System.out.println(distinctNames);
		
	}

}
class PersonG{
	String firstName;
	String lastName;
	int age;
	
	public PersonG(String fn, String ln, int ag) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;
	}
	public String displayName() {
		return this.firstName + this.lastName;
		
	}
	public int getAge() {
		return this.age;
	}
	
}