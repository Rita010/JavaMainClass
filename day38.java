package One;

import java.util.List;
import java.util.stream.Collectors;

public class day38 {

	public static void main(String[] args) {
 
		List<PersonS> peoples = List.of(
					new PersonS("rita khatiwoda",24,"Phoenix"),
					new PersonS("laxmi chapagain",24,"maryland"),
					new PersonS("pragati gautam",35,"texas"),
					new PersonS("satya koka",34,"pennsylvania"),
					new PersonS("Rashmi kc",23,"Idaho")
		
				);
List<PersonS> above30Age = peoples.stream().filter(person -> person.getAge()>30).collect(Collectors.toList());
	System.out.println(above30Age);
	
	for(int i = 0; i < above30Age.size(); i++) {
		System.out.println(above30Age.get(i).getAge());
		System.out.println(above30Age.get(i).getCity());
		System.out.println(above30Age.get(i).getName());
	}

	
	System.out.println("________________________________________________");
	
	// map and collect
	//["rita khatiwada","laxmi chapagain", "pragati gautam", "satya koka", "rasmi kc"]
	
	List<String> names = peoples.stream().map(person -> person.getName()).collect(Collectors.toList());
	
	for(String nm : names) {
		System.out.println(nm);
	}
	
	System.out.println("________________________________________");
	
	
	// Program 3
	// Person and city
	// "mayuri rao:pune"
	
	List<String> hhh = peoples.stream()
			.map(person -> person.getName()
					.concat(" : ")
					.concat(person.getCity()))
			.collect(Collectors.toList());
	

	for(String nc : hhh) {
		System.out.println(nc);
	}
	

	}

}
class PersonS{
	private String name;
	private int age;
	private String city;
	public PersonS(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	public String getName() {
		return name;
		
	}
	public int getAge() {
		return age;
		
	}
	public String getCity() {
		return city;
		
	}
}







