package One;

public class InnerClassFinalPractice {

	public static void main(String[] args) {
		
		OrganicTea or = new OrganicTea();
		or.displayOrganicTea();
		
		OrganicTea.MilkTea mt = or.new MilkTea ();
		mt.dispayMilkTea();
		
	}

}
class OrganicTea{
	public void displayOrganicTea() {
		System.out.println("Organic Tea is good");
	}
	class MilkTea {
		public void dispayMilkTea() {
			System.out.println("I love milk Tea");
		}
	}
}