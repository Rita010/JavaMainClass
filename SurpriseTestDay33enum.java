package One;

enum roles 
{
	ADMin, Sales, Customer, Support, Manager;

	public String getroles() 
	{
		switch (this) 
		{

		case ADMin:
			return "admin head";

		case Sales:
			return "sales boy";

		case Customer:
			return "customer care";

		case Support:
			return "support system";
		case Manager:
			return "manage the team";
		}
		return "Please check again and enter";
		

	}
}

public class SurpriseTestDay33enum {

	public static void main(String[] args) {
		
		//assign the value for print
		
		String dept = roles.Support.getroles();
		
		//Print
		
		System.out.println(dept);

	}
}


 