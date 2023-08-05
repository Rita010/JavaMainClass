package One;

import java.util.Arrays;
import java.util.List;

public class day36 {

	public static void main(String[] args) {

		Employee[]employees = {
				new Employee (1, "rita khatiwoda", 1000),
				new Employee (1,"laxmi chapagain", 5000),
				new Employee (1,"pragati gautam", 6000)
		};
//		
//		for(int i = 0; i < employees.length; i++) {
//			employees [i].displayFullName();
//		}
		
		List<Employee> emlist= Arrays.asList(employees);
		
		// forEach()
		
		emlist.stream().forEach(emp-> emp.incremantSalry(10));
		
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].salary);
		}
		
		
	
		// filter()
		// map()
	
		
	}

}
class Employee{
	int id;
	String fullName;
	int salary;
	
	public Employee (int id, String fn, int sal) {
		this.id= id;
		this.fullName=fn;
		this.salary= sal;			
	}
	public void displayFullName() {
		System.out.println(this.fullName);
	}
	public void incremantSalry(int x) {
		this.salary = this.salary + x;
	}
}