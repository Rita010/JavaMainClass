package One;   // showing error here. Need to ask sir

public class day22bb {

	public static void main(String[] args) {
		
		//overriding - different class, same method, same signature, inheritance
	
			Chase pune = new Chase("USA", "Maryland");

				pune.loan();
				pune.save();
				pune.displyMessage();

			}

		}

		class USBank {
			String country;

			// constructor

			public USBank(String cnt) {
				this.country = cnt;
			}

			public void save() {
				System.out.println("This is a save method form the Usbank.");
			}

			public void loan() {
				System.out.println("This is a loan method form the Usbank.");
			}

			public void displyMessage() {
				System.out.println("Welcome to UsBank.");
			}
		}

		class PNC extends USBank {
			String branchName;

			public PNC(String cnt, String bn) {
				super(cnt);
				this.branchName = bn;
			}
			// overloading the parent methods loan and save

			public void save() {
				System.out.println("This is save for PNC pune");
			}

			public void loan() {
				System.out.println("This is loan from PNC pune");
			}

		}

		class Chase extends USBank {

			String branchName;

			public Chase(String cnt, String bn) {
				super(cnt);
				this.branchName = bn;
			}

			

			// overriding the parent methods loan and save
			public void save() {
				System.out.println("This is save from SBIZ pune");
			}

			public void loan() {
				System.out.println("This is loan for SBIZ pune");
			}
		



	}


