package One;

public class innerclassRabindradai {

	public static void main(String[] args) {

		Department dp = new Department("Account","Admin");
		Department.Employee ep = dp.new Employee();
	
		
	}

}
class Department{
	// properties
	String DeptName;
	String DeptLocation;
	// constructor
	public Department(String dn, String dl) {
		this.DeptName = dn;
		this.DeptLocation = dl;
	}
	//private method return type
	private String displayDeptName() {
		
		return this.DeptName;	
	}
	// inner class
	class Employee{
		// properties
		String EmployeeName;
		// method
		public void setEmployee() {
			
			// accessing DeptLocation
			
			if(Department.this.DeptName.equals("Account")) {
				this.EmployeeName="Rita";
				
				System.out.println(this.EmployeeName);
			}
			else if(Department.this.DeptName.equals("Admin")) {	
			}
			this.EmployeeName="Laxmi";
			System.out.println(this.EmployeeName);
		}
		
	}
	
}
